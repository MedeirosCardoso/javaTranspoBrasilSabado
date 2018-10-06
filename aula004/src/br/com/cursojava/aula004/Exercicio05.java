/*Escreva um programa que apresente o resultado da soma dos 50 primeiros números inteiros positivos. (Utilize o comando for).*/
package br.com.cursojava.aula004;

public class Exercicio05 {
	
	public static void main(String[] args) {

		int resultado = 0;
		for (int i = 1; i <= 50; i++) {

			resultado += i;
		}
		System.out.print("Resultado dos 50 primeiros números inteiros positivos= " + resultado);
	}
}
