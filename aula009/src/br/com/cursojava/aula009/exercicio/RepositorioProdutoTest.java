package br.com.cursojava.aula009.exercicio;

import java.util.List;

import br.com.cursojava.aula009.Contato;
import br.com.cursojava.aula009.RepositorioContato;


public class RepositorioProdutoTest {

	public static void main(String[] args) {
		//testInserir();
		//testListarTodos();
		//testBuscarPorId();
		//testAtualizar();
		//testRemover();
	}

	private static void testInserir() {
		Produto produto = new Produto(null, "Geladeira", "FrosFre 500l", (float) 3250.85);
		RepositorioProduto repositorio = new RepositorioProduto();

		repositorio.inserir(produto);
		System.out.println(produto);
	}

	private static void testListarTodos() {
		RepositorioProduto repositorio = new RepositorioProduto();
		List<Produto> buscarTodos = repositorio.getTodos();
		System.out.println("==================");
		System.out.println("LISTAR TODOS");
		System.out.println("==================");

		for (Produto produto : buscarTodos) {
			System.out.println(produto);
		}
	}
	
	private static void testBuscarPorId() {
		System.out.println("==================");
		System.out.println("BUSCAR POR ID");
		System.out.println("==================");
		RepositorioProduto repositorio = new RepositorioProduto();
		System.out.println(repositorio.buscarPorId(1));
		//System.out.println(repositorio.buscarPorId(2));
		System.out.println(repositorio.buscarPorId(33));
	}
	
	private static void testAtualizar() {
		System.out.println("==================");
		System.out.println("ATUALIZAR PRODUTO");
		System.out.println("==================");
		RepositorioProduto repositorio = new RepositorioProduto();
		Produto produto = repositorio.buscarPorId(2);

		produto.setNome("Refrigerador");
		repositorio.atualizar(produto);
		produto = repositorio.buscarPorId(2);
		System.out.println(produto);
	}
	
	private static void testRemover() {
		System.out.println("==================");
		System.out.println("REMOVER PRODUTO");
		System.out.println("==================");
		RepositorioProduto repositorio = new RepositorioProduto();
		repositorio.remover(1);
		System.out.println(repositorio.buscarPorId(1));
	}
}
