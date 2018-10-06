/*Escreva um programa que solicite 10 notas e em seguida apresente as notas informadas juntamente com a maior e a menor nota.*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float[] notas = new float[10];

		for (int indice = 0; indice < notas.length; indice++) {
			System.out.println("Digite a " + (indice + 1) + "º" + " nota:");
			notas[indice] = Float.parseFloat(teclado.nextLine());
		}
		teclado.close();

		float maiorNota = 0;
		float menorNota = 0;

		for (int i = 0; i < notas.length; i++) {

			System.out.print(notas[i] + " - ");

			maiorNota = notas[0];
			menorNota = notas[0];

			if (maiorNota <= notas[i]) {
				maiorNota = notas[i];
			}
			if (menorNota >= notas[i]) {
				menorNota = notas[i];
			}
		}
		System.out.println("");

		System.out.printf("A maior nota: %.2f \n", maiorNota);
		System.out.printf("A menor nota: %.2f \n", menorNota);
	}
}
