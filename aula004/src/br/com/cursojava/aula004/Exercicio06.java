/*Escreva um programa que solicite um número entre 1 e 20, e em seguida apresente o valor do fatorial do número informado. 
  O programa deve validar os número informado solicitando um número correto sempre que o usuário informar um valor fora do range.
  (Utilize do/while e for).*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero=0;
		do {
			System.out.println("Digite um número entre 1 e 20");
			numero = Integer.parseInt(teclado.nextLine());
		} while (numero < 0 || numero > 20);
		teclado.close();
		
		int fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}

		System.out.printf("Fatorial do número %d é %d", numero, fatorial);
	}
}
