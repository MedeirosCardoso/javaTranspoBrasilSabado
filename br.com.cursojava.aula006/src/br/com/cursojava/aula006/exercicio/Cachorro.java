package br.com.cursojava.aula006.exercicio;

public class Cachorro extends Animal{
	
	@Override
	public void correr() {
		System.out.println("Cachorro está correndo!");
	}
	
	@Override
	public void comer(String comida) {
		System.out.println("Cachorro está comendo "+comida);
	} 
}
