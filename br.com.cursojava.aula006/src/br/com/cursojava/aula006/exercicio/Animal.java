package br.com.cursojava.aula006.exercicio;

public abstract class Animal {
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int valor) {
		this.idade = valor;
	}

	public abstract void correr();

	public abstract void comer(String comida);
}
