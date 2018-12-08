package br.com.cursojava.aula010.contato;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Identificar que a classe é uma entidade
@Table(name="contatos") //usado para o nome da tabela no banco, para qual tabela a classe ira utilizar

public class Contato {
	
	@Id //identificar a chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //informar a forma que vai gerar chave primaria
														//IDENTITY o banco que vai gerar as chaves primaria "serial"
	private Integer id;
	
	@Column(nullable=false) //indicar o nome da coluna na tabela, nullable=não pode ser null
	private String nome;
	
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=true) // nullable=pode ser null
	private String telefone;

	public Contato(Integer id, String nome, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public Contato() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}

}
