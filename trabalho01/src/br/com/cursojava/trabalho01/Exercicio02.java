/*Crie um programa que solicite  10 notas e as armazene em um array. Em seguida calcule a média das notas
  e apresente todas as notas que possuem valor igual ou maior que a média.*/
package br.com.cursojava.trabalho01;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float[] notas = new float[10];
		float mediaDasNotas = 0;
		float somaDasNotas = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %dº nota:", i + 1);
			notas[i] = Float.parseFloat(teclado.nextLine());

			somaDasNotas += notas[i];

		}
		teclado.close();

		System.out.printf("A média das notas é: %.2f \n", mediaDasNotas = somaDasNotas / notas.length);
		System.out.println("");

		System.out.println("As notas com valor igual ou maior ao valor da média: ");

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= mediaDasNotas) {
				System.out.print(notas[i] + " - ");
			}
		}
	}
}
