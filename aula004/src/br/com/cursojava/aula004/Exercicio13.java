/*Escreva um programa que solicite 10 nomes e em seguida apresente o nome que possui a maior quantidade de caracteres.*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String[] nomes = new String[5];

		for (int index = 0; index < nomes.length; index++) {
			System.out.printf("Digite o %dº nome \n", index + 1);
			nomes[index] = teclado.nextLine();
		}
		teclado.close();

		String maiorNome = nomes[0];
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].length() > maiorNome.length()) {
				maiorNome = nomes[i];
			}
		}
		System.out.printf("A nome possui mais caracteres é %s", maiorNome);
	}
}
