package br.com.cursojava.aula003;

public class Exercicio16 {
	/*
	 * Escreva um programa que solicite uma palavra para o usuário e em seguida
	 * repita a palavra digitada conforme o exemplo abaixo: 
	 * palavra = "Java 
	 *            Java Java 
	 *            Java Java Java 
	 *            Java Java Java Java Java
	 */

	public static void main(String[] argas) {
		String palavra = "java ";
		int i=0;
		while (i<palavra.length()) {
			int j=0;
				while(j++<=i){
					System.out.print(palavra);
				}
				System.out.println("");
			i++;
		}
	}
}
