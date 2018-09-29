/*Escreva um programa que solicita a idade do usuário e o classifica de acordo com a tabela abaixo:
 * 0 a 12 - criança.
 * 13 a 17 - Adolescente.
 * 18 a 24 - Jovem.
 * 25 a 29 - Adulto.
 * 60 ou mais - Idoso.
 */
package br.com.cursojava.avaliacao001;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a sua idade: ");

		int idade = Integer.parseInt(teclado.nextLine());

		teclado.close();

		if (idade > 0 && idade <= 12) {
			System.out.printf("A idade %d ,Categoria criança", idade);
		} else if (idade >= 13 && idade <= 17) {
			System.out.printf("A idade %d ,Categoria adolescente", idade);
		} else if (idade >= 18 && idade <= 24) {
			System.out.printf("A idade %d ,Categoria jovem", idade);
		} else if (idade >= 25 && idade <= 29) {
			System.out.printf("A idade %d ,Categoria adulto", idade);
		} else {
			System.out.printf("A idade %d ,Categoria idoso", idade);
		}

	}

}
