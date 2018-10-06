/*Escreva um programa que solicite 5 nomes e após solicitar o último nome,
  apresente todos os nomes digitados na sequência inversa 
  (último nome deve ser o primeiro, penúltimo, deve ser o segundo, etc, primeiro deve ser o último).*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[5];
		for (int indice = 0; indice < nomes.length; indice++) {
			System.out.println("Digite o " + (indice + 1) + "ºnome: ");
			nomes[indice] = teclado.nextLine();
		}
		teclado.close();

		for (int i = nomes.length; i > 0; i--) {
			System.out.println(i + "º" + " nome: " + nomes[i - 1]);
		}
	}
}
