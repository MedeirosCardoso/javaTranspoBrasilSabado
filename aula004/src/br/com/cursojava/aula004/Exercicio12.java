/*Escreva um programa que solicite 10 notas e em seguida calcule a m�dia das notas. 
  O programa deve apresentar todas as notas que possuem valor igual ou maior ao valor da m�dia.*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args){

		Scanner teclado = new Scanner(System.in);

		float[] notas = new float[10];
		float media = 0;
		float soma=0;
		float maiorNota=0;
		
		for (int indice = 0; indice < notas.length; indice++) {
			System.out.println("Digite a " + (indice + 1) + "�" + " nota:");
			notas[indice] = Float.parseFloat(teclado.nextLine());
			soma+=notas[indice];
			media=soma/notas.length;
		}
		teclado.close();
		System.out.printf("A m�dia das notas �: %.2f \n", media);
		
		for(int i=0;i<notas.length;i++){
			if(media>=notas[i]){
				maiorNota=notas[i];
			}
		}
		System.out.printf("A maior nota � %.2f", maiorNota);
	}
}
