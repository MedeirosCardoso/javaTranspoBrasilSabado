/*Escreva um programa que solicite um n�mero e em seguida informe o valor do n�mero elevado a quinta pot�ncia.*/
package br.com.cursojava.avaliacao001;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numero = Integer.parseInt(teclado.nextLine());

		teclado.close();

		System.out.printf("O numero elevado a quinta po�ncia � %d", Math.pow(numero, 5));

	}

}
