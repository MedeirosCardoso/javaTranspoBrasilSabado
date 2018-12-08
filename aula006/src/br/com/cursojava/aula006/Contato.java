package br.com.cursojava.aula006;

public class Contato { // classe so aceita dois tipos de visibilidade: public ou
						// visibilidade de pacote;
						// se não for declarado a visibilidade por padrão é
						// aplicado a visibilidade de pacote;
	private String nome;
	String email;
	String telefone;
	private boolean novo;
	private static int quantidadeContatos = 0;

	public Contato() {
		quantidadeContatos++;
		System.out.println("Quantidade de contatos = " + quantidadeContatos);
	}

	public void setNome(String nome) {
		if (nome != null && nome.length() >= 3) {
			this.nome = nome;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public boolean isNovo() {
		return novo;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
	}
}
