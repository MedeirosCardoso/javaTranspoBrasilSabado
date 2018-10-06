/*Escreva um programa que solicite dois n�meros ao usu�rio, onde o segundo n�mero deve ser maior que o primeiro. 
  Em seguida escreva os n�meros contidos entre o primeiro e o segundo n�mero digitado. O programa deve voltar a 
  solicitar o segundo n�mero sempre que o usu�rio digitar um valor menor ou igual ao primeiro. 
  (Utilize do/while e for).*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero01, numero02;

		System.out.println("Digite o primeiro n�mero: ");
		numero01 = Integer.parseInt(teclado.nextLine());
		
		do {
			System.out.println("Digiteo segundo n�mero: ");
			numero02 = Integer.parseInt(teclado.nextLine());
		} while (numero01 >= numero02);
		
		teclado.close();

		for (int i = numero01; i <= numero02; i++) {
			System.out.print(i + " ");
		}
	}
}
