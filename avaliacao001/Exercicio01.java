/*Escreva um programa que solicite um n�mero e informe se o n�mero informado � par ou impar.*/
package br.com.cursojava.avaliacao001;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] argas) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro: ");

		int numero = Integer.parseInt(teclado.nextLine());

		teclado.close();

		if (numero % 2 == 0) {
			System.out.printf("o numero %d � PAR.", numero);
		} else {
			System.out.printf("o numero %d � IMPAR.", numero);
		}
	}
}
