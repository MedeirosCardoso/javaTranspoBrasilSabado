/*Crie um programa que solicite o nome de 20 produtos e os armazene em um array. 
  Os produtos informados não podem possuir o mesmo nome. 
  Após a inserção dos produtos o programa deve apresentar um menu onde
  o usuário pode solicitar o nome de um produto e o programa de informar
  se o produto está contido ou não na lista de produtos digitada. 
  O programa deve ser encerrado quando o usuário digitar sair. */
package br.com.cursojava.trabalho01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String[] listaDeProdutos = new String[20];
		String produto = null;
		boolean existe = false;
		byte cont = 0;

		for (int i = 0; i < listaDeProdutos.length; i++) {
			System.out.printf("Digite o %d° produto: ", i + 1);
			produto = teclado.nextLine();

			for (int j = 0; j < cont; j++) {
				if (produto.equalsIgnoreCase(listaDeProdutos[j])) {
					j = 0;
					System.out.println("Produto já cadastrado!");
					System.out.printf("Digite o %d°produto", i + 1);
					produto = teclado.nextLine();
				}
			}
			listaDeProdutos[i] = produto;
			cont++; // Variável para controlar a quantidade de elementos que já foi inserido na lista;
		}

		do {
			System.out.println("------------------------------------------------------");
			System.out.println("Digite o nome do produto que deseja pesquisar");
			System.out.println("           ou ");
			System.out.println("Digite SAIR para encerrar");
			System.out.println("------------------------------------------------------");
			produto = teclado.nextLine();

			for (int i = 0; i < listaDeProdutos.length; i++) {
				if (produto.equalsIgnoreCase(listaDeProdutos[i])) {
					existe = true;
					break;
				} else {
					existe = false;
				}
			}

			if (existe) {
				System.out.println("O produto está contido na lista de produtos \n");
			} else if (produto.equalsIgnoreCase("SAIR")) {
				break;
			} else {
				System.out.println("O produto não está contido na lista de produtos \n");
			}
		} while (!produto.equalsIgnoreCase("SAIR"));
		teclado.close();

		System.out.println("Programa encerrado.");
	}

}
