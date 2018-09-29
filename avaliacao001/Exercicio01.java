/*Escreva um programa que solicite um número e informe se o número informado é par ou impar.*/
package br.com.cursojava.avaliacao001;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] argas) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");

		int numero = Integer.parseInt(teclado.nextLine());

		teclado.close();

		if (numero % 2 == 0) {
			System.out.printf("o numero %d é PAR.", numero);
		} else {
			System.out.printf("o numero %d é IMPAR.", numero);
		}
	}
}
