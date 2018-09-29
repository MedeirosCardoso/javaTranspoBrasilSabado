/*Escreva um programa que solicite ao usuário a sua idade e em seguida apresente o valor da idade do usuário após 20 anos.*/
package br.com.cursojava.avaliacao001;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a sua idade: ");

		int idade = Integer.parseInt(teclado.nextLine());

		teclado.close();

		System.out.printf("A sua idade após 20 anos é %d anos.", idade + 20);
	}

}
