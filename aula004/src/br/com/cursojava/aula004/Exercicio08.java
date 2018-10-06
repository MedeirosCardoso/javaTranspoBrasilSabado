/*Escreva um programa que solicite uma palavra ao usuário e em seguida escreva a palavra conforme o exemplo abaixo. (Utilize o comando for).
EX: palavra = “Brasil”
B
Br
Bra
Bras
Brasi
Brasil 
*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = teclado.nextLine();
		teclado.close();

		for (int i = 0; i < palavra.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(palavra.charAt(j));
			}
			System.out.println("");
		}
	}
}
