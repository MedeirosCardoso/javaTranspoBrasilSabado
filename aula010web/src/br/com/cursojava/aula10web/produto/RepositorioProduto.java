package br.com.cursojava.aula10web.produto;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import br.com.cursojava.aula010web.utils.JPAUtil;

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
		TypedQuery<Produto> query = em.createQuery("SELECT p FROM Produto p WHERE p.preco > :min OR p.preco < :max ", Produto.class);
		lista = query.getResultList();
		em.close();
		return lista;
	}
}
