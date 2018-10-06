/*Escreva um programa que solicite uma palavra e em seguida apresente a palavra de modo inverso (de trás para frente). 
  Utilize o comando do/while para criar a palavra no modo inverso; */
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite uma palavra: ");

		String palavra = teclado.nextLine().toUpperCase();
		teclado.close();

		int posicao = palavra.length();

		do {

			System.out.print(palavra.charAt(posicao - 1));

			posicao--;

		} while (posicao > 0);
		
		System.out.println("\n"+"FIM!");
	}
}

