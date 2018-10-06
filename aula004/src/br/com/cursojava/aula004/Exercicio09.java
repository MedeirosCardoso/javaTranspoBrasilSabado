/*Escreva um programa que solicite 5 notas e após solicitar última nota, apresente todas as notas digitadas.*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float[] nota = new float[5];

		for (int indice = 0; indice < nota.length; indice++) {
			System.out.println("Digite a nota " + (indice + 1));
			nota[indice] = Float.parseFloat(teclado.nextLine());
		}
		teclado.close();

		for (float notas : nota) {
			System.out.println("Notas: " + notas);
		}
	}
}
