/*Escreva um programa que solicite 10 notas e em seguida calcule e apresente o valor da m�dia das notas, 
  juntamente com as notas que possuem valor menor que a m�dia.*/
package br.com.cursojava.aula004;
import java.util.Scanner;
public class Exercicio14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float[] notas = new float[10];
		float media=0;
		float soma=0;
		for(int i=0;i<notas.length;i++) {
			System.out.printf("Digite a %d� nota", i+1);
			notas[i]=Float.parseFloat(teclado.nextLine());
			soma+=notas[i];
			media=soma/notas.length;
		}
		teclado.close();
		
		System.out.printf("A m�dia das notas � %.2f \n", media);
		System.out.println("As notas com valor igual ou menor ao valor da m�dia: ");
		for(int i=0;i<notas.length;i++) {
			if(notas[i]<=media) {
				System.out.print(notas[i] + " - ");
			}
		}
	}
}
