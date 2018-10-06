/*Escreva um programa que apresente o menu abaixo até que o usuário digite ‘ S ’:
  	A – Abrir arquivo.
	B – Procurar arquivo.
	C – Download arquivo.
	D – Upload de arquivo.
	S – Sair.*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String opcao = null;
		do {
			System.out.println("A - Abrir Arquivo.");
			System.out.println("B - Procupar Arquivo.");
			System.out.println("C - Download de Arquivo.");
			System.out.println("D - Upload de Arquivo.");
			System.out.println("S - Sair.");

			opcao = teclado.nextLine().toUpperCase();

			switch (opcao) {
			case "A":
				System.out.println("Abrindo o Arquivo...");
				break;
			case "B":
				System.out.println("Procurando o Arquivo");
				break;
			case "C":
				System.out.println("Download do Arquivo...");
				break;
			case "D":
				System.out.println("Upload do Arquivo...");
				break;
			case "S":
				System.out.println("finalisando...");
				break;
			default:
				System.out.println("Opção Inválida!");
			}
		} while (!"S".equals(opcao));

		System.out.println("FIM !");

		teclado.close();
	}
}
