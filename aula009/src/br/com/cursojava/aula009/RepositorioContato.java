package br.com.cursojava.aula009;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Repositório de contatos, responsável por realizar a transformação
 * dos dados entre o paradigma do banco de dados e a aplicação (O.O)
 */
public class RepositorioContato {

	public void inserir(Contato contato) {
		String sql = "INSERT INTO contatos(nome, email, telefone) VALUES(?,?,?)";
		Connection conexao = BancoUtil.getConexao();

		try {
			// Statement.RETURN_GENERATED_KEYS para pegar a chave primaria que o
			// SGBD gerou.
			PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, contato.getNome());
			comando.setString(2, contato.getEmail());
			comando.setString(3, contato.getTelefone());

			comando.execute();
			// pega a chave que foi gerada no BD
			ResultSet keys = comando.getGeneratedKeys();

			if (keys.next()) {
				// se existe a chave, pega a primeira coluna e SET o valor no id
				// do contato.
				Integer id = keys.getInt(1);
				contato.setId(id);
			}
			// fecha o ResultSet
			keys.close();
			// fecha o PreparedStatement
			comando.close();

		} catch (SQLException e) {
			System.out.println("Não foi possível inserir o registro no banco");
		}
	}

	public List<Contato> buscarTodos() {
		List<Contato> lista = new ArrayList<>();
		String sql = "SELECT * FROM contatos";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			Contato contato = null;
			while (cursor.next()) {
				contato = criarContato(cursor);
				lista.add(contato);
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar a lista de registros");
		}
		return lista;
	}

	private Contato criarContato(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");// pega a informação dessa coluna que o
											// cursor está parado;
		String nome = cursor.getString("nome");
		String email = cursor.getString("email");
		String telefone = cursor.getString("telefone");

		return new Contato(id, nome, email, telefone);
	}

	public Contato buscarPorId(Integer id) {
		Contato contato = null;
		String sql = "SELECT * FROM contatos WHERE id=?";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);// configura o comando;
			ResultSet cursor = comando.executeQuery();
			if (cursor.next()) {
				contato = criarContato(cursor);
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar o registro especificado");
		}
		return contato;
	}

	public void atualizar(Contato contato) {
		String sql = "UPDATE contatos SET nome=?, email=?, telefone=? WHERE id=?";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setString(1, contato.getNome());
			comando.setString(2, contato.getEmail());
			comando.setString(3, contato.getTelefone());
			comando.setInt(4, contato.getId());

			comando.executeUpdate();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possível atualizar o registro no banco");
		}
	}

	public void remover(Integer id) {
		String sql = "DELETE FROM contatos WHERE id=?";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);

			comando.execute();
			comando.close();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possível remover o registro especificado");
		}
	}

	public long contar() {
		String sql = "SELECT COUNT(*) AS total FROM contatoS";
		Connection conexao = BancoUtil.getConexao();
		long total = 0;

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			if (cursor.next()) {
				total = cursor.getLong("total");
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel contar a quantidae de registros");
		}
		return total;
	}
}
