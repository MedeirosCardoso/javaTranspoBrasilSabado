/*Escreva um programa que solicite 5 nomes e ap�s solicitar o �ltimo nome,
  apresente todos os nomes digitados na sequ�ncia inversa 
  (�ltimo nome deve ser o primeiro, pen�ltimo, deve ser o segundo, etc, primeiro deve ser o �ltimo).*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[5];
		for (int indice = 0; indice < nomes.length; indice++) {
			System.out.println("Digite o " + (indice + 1) + "�nome: ");
			nomes[indice] = teclado.nextLine();
		}
		teclado.close();

		for (int i = nomes.length; i > 0; i--) {
			System.out.println(i + "�" + " nome: " + nomes[i - 1]);
		}
	}
}
