/*Crie um programa que solicite 10 notas e as armazene em um array. Em seguida crie dois novos arrays 
  onde o primeiro deve conter as notas menores que a média e o segundo deve conter as notas maiores
  ou iguais a média. Os Arrays auxiliares(que armazena as notas divididas) 
  devem possuir um tamanho exatamente igual a quantidade a ser armazenada em cada um. 
  (Se tiver 5 notas maiores ou iguais a média então os array auxiliares deverão ser respectivamente de tamanho 3 e 7).*/
package br.com.cursojava.trabalho01;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float[] notas = new float[10];
		float somaDasNotas = 0;
		float mediaDasNotas = 0;
		int qntNotasMaior = 0;
		int qntNotasMenor = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %dº nota:", i + 1);
			notas[i] = Float.parseFloat(teclado.nextLine());
			somaDasNotas += notas[i];
		}
		teclado.close();

		mediaDasNotas = somaDasNotas / notas.length;

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= mediaDasNotas) {
				qntNotasMaior++;
			}
			if (notas[i] < mediaDasNotas) {
				qntNotasMenor++;
			}
		}

		float[] notasMaiores = new float[qntNotasMaior];
		float[] notasMenores = new float[qntNotasMenor];

		qntNotasMaior = 0;
		qntNotasMenor = 0;
		for (int i = 0; i < notas.length; i++) {
			// 5,6
			if (notas[i] >= mediaDasNotas) {
				notasMaiores[qntNotasMaior] = notas[i];
				qntNotasMaior++;
			}
			if (notas[i] < mediaDasNotas) {
				notasMenores[qntNotasMenor] = notas[i];
				qntNotasMenor++;
			}
		}

		System.out.println("Media das notas: " + mediaDasNotas);
		System.out.println("");

		System.out.println("Array com as menores notas: ");
		for (Float menores : notasMenores) {
			System.out.print(menores + " - ");
		}
		System.out.println("");

		System.out.println("Array com as maiores notas: ");
		for (Float maiores : notasMaiores) {
			System.out.print(maiores + " - ");
		}
	}
}
