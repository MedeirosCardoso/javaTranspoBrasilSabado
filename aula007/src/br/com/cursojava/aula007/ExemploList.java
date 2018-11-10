package br.com.cursojava.aula007;
import java.util.List;
import java.util.ArrayList;

public class ExemploList {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		//adicionar elementos ao final da lista
		nomes.add("João");
		nomes.add("Maria");
		System.out.println(nomes);
		//retorna a quantidade de elementos da lista [lista.size()]
		System.out.println(nomes.size());
		//adicionar elementos no inicio [lista.add(posicao,elemento)]
		nomes.add(0,"José");
		nomes.add(0,"Ana");
		System.out.println(nomes);
		nomes.add("Fredrico");
		System.out.println(nomes);
		//trocar o elemento [lista.set(indice, elemento)]
		nomes.set(nomes.size()-1, "Tibúrcio");
		System.out.println(nomes);
		//buscar um elemento específico na lista [lista.get(índice)]
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(2));
		System.out.println(nomes.get(3));
		//verificar o índice de um elemento [lista.indexOf(elemento)], retorna o primeiro elemento que ele encontrar.
		System.out.println(nomes.indexOf("Tibúrcio"));
		System.out.println(nomes.indexOf("Marília")); //se não existir retorna -1
		//verificar se um elemento está contido na lista [lista.contains(elemento)]
		System.out.println(nomes.contains("João"));
		System.out.println(nomes.contains("Bartolomeu"));
		//criar uma sublista[lista.sublist(inicio, fim)]
		List<String> sublista = nomes.subList(2,nomes.size());
		System.out.println(sublista);
		//remover um elemento da lista através do índice [lista.remove(index)]
		System.out.println(nomes);
		nomes.remove(0);
		System.out.println(nomes);
		//remover um elemento da lista através da referência [lista.remove(elemento)]
		nomes.remove("Maria");
		System.out.println(nomes);
		
	}

}
