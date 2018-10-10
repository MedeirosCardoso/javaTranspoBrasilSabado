/*Escreva um programa que solicite o nome e a nota de 10 alunos, em seguida calcule a média das notas e
  apresente o nome e a nota dos alunos que tiveram nota maior que a média.*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] alunos=new String [10];
		float[] notas = new float[10];
		float soma=0;
		float media=0;
		for(int i=0;i<notas.length;i++) {
			System.out.printf("Digite o nome do %dº aluno: \n", i+1);
			alunos[i]=teclado.nextLine();
			System.out.printf("Digite a nota do aluno");
			notas[i]=Float.parseFloat(teclado.nextLine());
			soma+=notas[i];
			media=soma/notas.length;
		}
		teclado.close();
		
		System.out.println("");
		System.out.println("O aluno com a maior nota que a média:");
		for(int i=0;i<notas.length;i++) {
			if(notas[i]>media) {
				System.out.println(alunos[i]);
				System.out.println(notas[i]);
			}
		}
	}
}
