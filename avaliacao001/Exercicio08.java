/*Escreva um programa que calcule e escreva os números primos entre 1 e 50.*/
package br.com.cursojava.avaliacao001;

public class Exercicio08 {

	public static void main(String[] args) {
		int numero = 1;
		while (numero <= 50) {
			if (numero % 1 == 0 && numero % numero == 0) {
				System.out.println(numero);
			}
			numero++;
		}
	}

}
