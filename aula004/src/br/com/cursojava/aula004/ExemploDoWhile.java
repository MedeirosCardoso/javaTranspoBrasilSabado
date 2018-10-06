package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo = 0;
		do {
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Listar produto");
			System.out.println("3 - Remover produto");
			System.out.println("4 - Sair");
			codigo = Integer.parseInt(teclado.nextLine());
			switch (codigo) {
			case 1:
				System.out.println("Escolheu a opção Castar Produto");
				break;
			case 2:
				System.out.println("Escolheu a opção Listar Produto");
				break;
			case 3:
				System.out.println("Escolheu a opção Removerr Produto");
				break;
			case 4:
				System.out.println("Exucutando logoff...");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (codigo != 4);

		System.out.println("Fim da aplicação");
		teclado.close();
	}

}
