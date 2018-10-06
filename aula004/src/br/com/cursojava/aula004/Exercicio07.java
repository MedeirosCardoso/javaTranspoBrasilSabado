/*Escreva um programa que solicite dois números ao usuário, onde o segundo número deve ser maior que o primeiro. 
  Em seguida escreva os números contidos entre o primeiro e o segundo número digitado. O programa deve voltar a 
  solicitar o segundo número sempre que o usuário digitar um valor menor ou igual ao primeiro. 
  (Utilize do/while e for).*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero01, numero02;

		System.out.println("Digite o primeiro número: ");
		numero01 = Integer.parseInt(teclado.nextLine());
		
		do {
			System.out.println("Digiteo segundo número: ");
			numero02 = Integer.parseInt(teclado.nextLine());
		} while (numero01 >= numero02);
		
		teclado.close();

		for (int i = numero01; i <= numero02; i++) {
			System.out.print(i + " ");
		}
	}
}
