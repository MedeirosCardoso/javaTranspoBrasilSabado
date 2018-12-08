package br.com.cursojava.aula010.exercicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import br.com.cursojava.aula010.utils.JPAUtil;

public class RepositorioProduto {

	public List<Produto> buscarTodos() {
		List<Produto> lista = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Produto> query = em.createQuery("select p from Produto p", Produto.class);
		lista = query.getResultList();
		em.close();
		return lista;
	}

	public Produto buscarPorId(Integer id) {
		Produto produto = null;
		EntityManager em = JPAUtil.createEntityManager();
		produto = em.find(Produto.class, id);
		em.close();
		return produto;
	}

	public Produto salvar(Produto produto) {
		if (produto != null) {
			if (produto.getId() == null) {
				return inserir(produto);
			} else {
				return atualizar(produto);
			}
		}
		return produto;
	}

	private Produto inserir(Produto produto) {
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		em.close();
		return produto;
	}

	private Produto atualizar(Produto produto) {
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.merge(produto);
		em.getTransaction().commit();
		em.close();
		return produto;
	}

	public void remover(Produto produto) {
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(produto));
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Produto> buscarPorFaixa(double min, double max){
		List<Produto> lista = null;
		EntityManager em = JPAUtil.createEntityManager();
		TypedQuery<Produto> query = em.createQuery("SELECT p FROM Produto p WHERE p.preco > :min and p.preco < :max ", Produto.class);
		lista = query.getResultList();
		em.close();
		return lista;
	}
	
	public static void main(String[] args){
		RepositorioProduto produto = new RepositorioProduto();
		
		/*System.out.println("===SALVAR PRODUTO===");
		Produto novoProduto = new Produto (null,"PROTUDO01",1500.59);
		produto.salvar(novoProduto);
		novoProduto = new Produto(null,"PRODUTO02",3.59);
		produto.salvar(novoProduto);*/
		
		/*List<Produto> lista = produto.buscarTodos();
		System.out.println("===LISTAR TODOS===");
		for(Produto p : lista){
			System.out.println(p);
		}*/
		
		/*System.out.println("===BUSCAR POR ID");
		System.out.println(produto.buscarPorId(1));*/
		
		/*Produto atualizarProduto = new Produto();
		atualizarProduto.setId(2);
		atualizarProduto.setNome("PRODUTO02");
		atualizarProduto.setPreco(500);
		produto.salvar(atualizarProduto);
		System.out.println("===ATUALIZAR PRODUTO===");
		System.out.println(produto.buscarTodos());*/
		
		/*Produto removerProduto = new Produto();
		removerProduto = produto.buscarPorId(3);
		produto.remover(removerProduto);
		List<Produto> lista = produto.buscarTodos();
		System.out.println("===REMOVER PRODUTO===");
		for(Produto p : lista){
			System.out.println(p);
		}*/
	
		List<Produto> lista = produto.buscarPorFaixa(100, 1000); 
		System.out.println("===FAIXA DE PREÇO===");
		for(Produto p : lista){
			System.out.println(p);
		}
		
	}
}
