package br.com.cursojava.aula007.exercicio;

public class Produto {
	private String nome;
	private String descricao;
	private float preco;

	public Produto() {
		super();
	}

	public Produto(String nome, String descricao, float preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	

	@Override
	public String toString() {
		return "Produto  [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]"+"\n";
	}
	
	

}
