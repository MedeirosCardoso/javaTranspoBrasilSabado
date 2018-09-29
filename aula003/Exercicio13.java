package br.com.cursojava.aula003;

import java.util.Scanner;

public class Exercicio13 {
	/*
	 * Escreva um programa que solicite 20 notas e escreva o valor da média das
	 * notas.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i = 1;
		float nota = 0;
		float media = 0;
		while (i <= 20) {
			System.out.println("Digite a nota " + i + ": ");
			nota = Float.parseFloat(teclado.nextLine());
			media += nota;
			i++;
		}
		teclado.close();
		System.out.printf("A média das notas é %.2f", media / 20);
	}
}
