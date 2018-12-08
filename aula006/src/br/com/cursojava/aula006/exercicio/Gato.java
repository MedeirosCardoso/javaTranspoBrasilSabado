package br.com.cursojava.aula006.exercicio;

public class Gato extends Animal {

	@Override
	public void correr() {
		System.out.println("Gato est� correndo!");
	}

	@Override
	public void comer(String comida) {
		System.out.println("Gato est� comendo " + comida);
	}

	public void comer(String comida, int quantidade) {

		System.out.printf("O Gato est� comendo %s %d vezes \n",comida,quantidade);
	}
}
