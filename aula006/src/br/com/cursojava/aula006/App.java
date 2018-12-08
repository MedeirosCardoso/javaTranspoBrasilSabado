package br.com.cursojava.aula006;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Contato contato = new Contato();

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o nome do contato");
		String nome = teclado.nextLine();

		contato.setNome(nome);
		contato.email = "adriano_cardoso@hotmail";
		contato.telefone = "999678979";

		System.out.println(contato.getNome());
		System.out.println(contato.email);
		System.out.println(contato.telefone);

		teclado.close();

	}
}
