/*Escreva um programa que apresente os números pares entre 100 e 200.*/
package br.com.cursojava.aula004;

public class Exercicio04 {

	public static void main(String[] args) {
		for (int i = 100; i <= 200; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
