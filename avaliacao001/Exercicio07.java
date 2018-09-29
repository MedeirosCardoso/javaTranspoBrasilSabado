/*Escreva um programa que solicite um número e em seguida informe o valor do número elevado a quinta potência.*/
package br.com.cursojava.avaliacao001;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = Integer.parseInt(teclado.nextLine());

		teclado.close();

		System.out.printf("O numero elevado a quinta poência é %d", Math.pow(numero, 5));

	}

}
