/*Escreva um programa que calcula a soma dos primeiros 50 n�meros inteiros.*/
package br.com.cursojava.avaliacao001;

public class Exercicio04 {

	public static void main(String[] args) {
		int numero = 50;

		float resultado = ((numero + 1) * numero) / 2;

		System.out.printf("A soma dos primeiros 50 n�meros � %.2f", resultado);
	}
}