package br.com.cursojava.aula007.exercicio;

import java.util.List;
import java.util.ArrayList;

public class ProdutoController {
	List<Produto> listaDeProdutos = new ArrayList<>();

	public void criarProduto(String nome, String descricao, float preco) {
		Produto novoProduto = new Produto(nome, descricao, preco);
		listaDeProdutos.add(novoProduto);
	}

	public Produto buscarProduto(int index) {
		if (index > -1 && index < listaDeProdutos.size()) {
			return listaDeProdutos.get(index);
		}
		return null;
	}

	public int tamanhoDaLista() {
		return listaDeProdutos.size();
	}
	
	public boolean removerProduto(int index){
		boolean resultado=false;
		if(index > -1 && index < listaDeProdutos.size()){
			listaDeProdutos.remove(index);
			resultado=true;
		}
		return resultado;
	}

}
