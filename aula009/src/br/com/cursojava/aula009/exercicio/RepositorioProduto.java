package br.com.cursojava.aula009.exercicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RepositorioProduto {

	public void inserir(Produto produto) {
		String sql = "INSERT INTO produtos(nome, descricao, preco) VALUES(?,?,?)";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setFloat(3, produto.getPreco());

			comando.execute();
			ResultSet keys = comando.getGeneratedKeys();

			if (keys.next()) {
				Integer id = keys.getInt(1);
				produto.setId(id);
			}
			keys.close();
			comando.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível inserir o registro no banco");
		}
	}

	public List<Produto> getTodos() {
		List<Produto> lista = new ArrayList<>();
		String sql = "SELECT * FROM produtos";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			Produto produto = null;
			while (cursor.next()) {
				produto = new Produto(
						cursor.getInt("id"),
						cursor.getString("nome"),
						cursor.getString("descricao"),
						cursor.getFloat("preco"));
				lista.add(produto);
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar a lista de registros");
		}
		return lista;
	}
	
	public Produto buscarPorId(Integer id) {
		Produto produto = null;
		String sql = "SELECT * FROM produtos WHERE id=?";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			ResultSet cursor = comando.executeQuery();
			if (cursor.next()) {
				produto =new Produto(
						cursor.getInt("id"),
						cursor.getString("nome"),
						cursor.getString("descricao"),
						cursor.getFloat("preco"));
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar o registro especificado");
		}
		return produto;
	}
	
	public void atualizar(Produto produto){
		String sql = "UPDATE produtos SET nome=?, descricao=?,preco=? WHERE id=?";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setFloat(3, produto.getPreco());
			comando.setInt(4, produto.getId());
			
			comando.executeUpdate();
			comando.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar o registro especificado");
	}
	}
	
	public void remover(Integer id){
		String sql = "DELETE FROM produtos WHERE id=?";
		Connection conexao = BancoUtil.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			comando.execute();
			comando.close();
			
		}catch (SQLException e){
			e.printStackTrace();
			System.out.println("Não foi possivel remover o registro especificado");
		}
	}
	
	public List<Produto> buscarPorFaixa (float min, float max) {
		List<Produto> lista = new ArrayList<>();
		String sql = "SELECT * FROM produtos WHERE preco BETWEEN ? and ? ";
		Connection conexao = BancoUtil.getConexao();

		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setFloat(1, min);
			comando.setFloat(1, max);
			ResultSet cursor = comando.executeQuery();
			Produto produto = null;
			while (cursor.next()) {
				produto = new Produto(
						cursor.getInt("id"),
						cursor.getString("nome"),
						cursor.getString("descricao"),
						cursor.getFloat("preco"));
				lista.add(produto);
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não foi possivel recuperar a lista de registros");
		}
		return lista;
	}
	
}