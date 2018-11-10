package br.com.cursojava.aula007.exercicio;

import java.util.Scanner;

public class CadastroProduto {
	ProdutoController controller = new ProdutoController();

	public void mostrarMenu(Scanner teclado) {
		System.out.println("####### MENU PRINCPAL #######");
		int opcao = 0;
		do {
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produto");
			System.out.println("3 - Remover Produto");
			System.out.println("4 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while (opcao != 4);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			cadastrarProduto(teclado);
			break;
		case 2:
			listarProduto();
			break;
		case 3:
			removerProduto(teclado);
			break;
		case 4:
			sair();
			break;
		default:
			mostrarOpcaoInvalida();
		}

	}

	private void cadastrarProduto(Scanner teclado) {
		System.out.println("####### CADASTRAR NOVO PRODUTO #######");
		System.out.println("Informe o nome do produto:");
		String nome = teclado.nextLine();
		System.out.println("Informe a descrição do produto:");
		String descricao = teclado.nextLine();
		System.out.println("Informe preço do produto:");
		float preco = Float.parseFloat(teclado.nextLine());
		controller.criarProduto(nome, descricao, preco);
		System.out.println("########################");
	}

	private void listarProduto() {
		System.out.println("####### LISTA DE PRODUTOS ######");
		for(int i=0;i<controller.tamanhoDaLista();i++){
			System.out.printf("%s %d %s", "indice:",i+1,controller.buscarProduto(i));
		}
	}

	private void removerProduto(Scanner teclado) {
		System.out.println("Informe o indice do produto para remove-lo:");
		int index = Integer.parseInt(teclado.nextLine());
		if(controller.removerProduto(index-1)){
			System.out.println("Produto removido.");
		}else{
			System.out.println("Produto não cadastrado!");
		}
	}

	private void sair() {
		System.out.println("Obrigado por utilizar nosso Sistema.");

	}

	private void mostrarOpcaoInvalida() {
		System.out.println("Você digitou uma opção inválida.");

	}

}
