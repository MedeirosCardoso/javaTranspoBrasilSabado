/*Crie um programa que solicite o nome de 20 produtos e os armazene em um array. 
  Os produtos informados n�o podem possuir o mesmo nome. 
  Ap�s a inser��o dos produtos o programa deve apresentar um menu onde
  o usu�rio pode solicitar o nome de um produto e o programa de informar
  se o produto est� contido ou n�o na lista de produtos digitada. 
  O programa deve ser encerrado quando o usu�rio digitar sair. */
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
			System.out.printf("Digite o %d� produto: ", i + 1);
			produto = teclado.nextLine();

			for (int j = 0; j < cont; j++) {
				if (produto.equalsIgnoreCase(listaDeProdutos[j])) {
					j = 0;
					System.out.println("Produto j� cadastrado!");
					System.out.printf("Digite o %d�produto", i + 1);
					produto = teclado.nextLine();
				}
			}
			listaDeProdutos[i] = produto;
			cont++; // Vari�vel para controlar a quantidade de elementos que j� foi inserido na lista;
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
				System.out.println("O produto est� contido na lista de produtos \n");
			} else if (produto.equalsIgnoreCase("SAIR")) {
				break;
			} else {
				System.out.println("O produto n�o est� contido na lista de produtos \n");
			}
		} while (!produto.equalsIgnoreCase("SAIR"));
		teclado.close();

		System.out.println("Programa encerrado.");
	}

}
