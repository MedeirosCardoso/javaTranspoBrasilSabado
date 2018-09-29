package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio15 {
	/*
	 * Escreva um programa que solicite o nome do usuário e em seguida apresente
	 * a quantidade de caracteres do nome informado. o programa deve ficar
	 * solicitando entradas até que o nome informado seja uma String vazia.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();
		
		while (!nome.isEmpty()) {
			System.out.printf("O nome %s tem %d caracteres \n", nome, nome.length());
			System.out.println("Digite seu nome: ");
			nome = teclado.nextLine();
			
		}
		teclado.close();
		System.out.println("Você finalizou o programa!");
	}
}
