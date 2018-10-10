/*Escreva um programa que solicite o valor de 10 produtos e em seguida 
  escreva o valor dos produtos aplicando um desconto de 10%.*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float[] produtos = new float[3];
		for (int i = 0; i < produtos.length; i++) {
			System.out.printf("Digite o valor do %dº produto", i + 1);
			produtos[i] = Float.parseFloat(teclado.nextLine());
		}
		teclado.close();
		for (float produtoSemDes : produtos) {
			System.out.print("R$ " + produtoSemDes + " - ");
		}
		System.out.println("");
		System.out.println("Produtos com 10% desconto: ");
		for (int i = 0; i < produtos.length; i++) {
			produtos[i] -= (produtos[i] * 0.10f);
			System.out.print("R$ " + produtos[i] + " - ");
		}

	}
}
