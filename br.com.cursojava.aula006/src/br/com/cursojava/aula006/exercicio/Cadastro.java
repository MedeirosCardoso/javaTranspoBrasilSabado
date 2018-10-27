package br.com.cursojava.aula006.exercicio;

import java.util.Scanner;

public class Cadastro {

	public void mostrarMenu(Scanner teclado) {
		int opc = 0;
		do {
			System.out.println("1 - Cadastrar cachorro.");
			System.out.println("2 - Cadastrar gato.");
			System.out.println("3 - Listar animais.");
			System.out.println("4 - Sair.");
			opc = Integer.parseInt(teclado.nextLine());
		} while (opc != 4);
	}
}
