package br.com.cursojava.aula007.exercicio;

import java.util.Scanner;

public class AppProduto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CadastroProduto cadastro = new CadastroProduto();
		cadastro.mostrarMenu(teclado);
		teclado.close();

	}

}
