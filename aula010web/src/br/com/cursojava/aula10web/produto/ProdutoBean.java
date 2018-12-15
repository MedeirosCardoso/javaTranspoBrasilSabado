package br.com.cursojava.aula10web.produto;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ProdutoBean {
	private FacadeProduto facade = new FacadeProduto();
	private List<Produto> produtos = new ArrayList<>();
	private Produto produto = facade.novoProduto();

	public List<Produto> getProdutos() {
		if (produtos == null || produtos.isEmpty()) {
			produtos = facade.carregarProdutos();
		}
		return produtos;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String salvar() {
		System.out.println("Preciso salvar o produto");
		return null;
	}
}
