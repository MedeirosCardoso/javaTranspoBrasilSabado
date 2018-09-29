package br.com.cursojava.aula003;

public class Exercicio14 {
	/* Escreva um programa que apresente os números impares entre 1 e 100 */
	public static void main(String[] argas) {
		int numero = 0;
		while (numero <= 100) {
			if (numero % 2 != 0) {
				System.out.println(numero);
			}
			numero++;
		}
	}
}
