/*Escreva um programa que solicita 10 notas e em seguida calcula e apresenta a menor e a maior nota digitada.*/
package br.com.cursojava.avaliacao001;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		float nota01 = Float.parseFloat(teclado.nextLine());
		System.out.println("Digite a segunda nota: ");
		float nota02 = Float.parseFloat(teclado.nextLine());
		System.out.println("Digite a terceira nota: ");
		float nota03 = Float.parseFloat(teclado.nextLine());
		System.out.println("Digite a quarta nota: ");
		float nota04 = Float.parseFloat(teclado.nextLine());
		System.out.println("Digite a quinta nota: ");
		float nota05 = Float.parseFloat(teclado.nextLine());
		System.out.println("Digite a sexta nota: ");
		float nota06 = Float.parseFloat(teclado.nextLine());
		System.out.println("Digite a setima nota: ");
		float nota07 = Float.parseFloat(teclado.nextLine());
		System.out.println("Digite a oitava nota: ");
		float nota08 = Float.parseFloat(teclado.nextLine());
		System.out.println("Digite a nona nota: ");
		float nota09 = Float.parseFloat(teclado.nextLine());
		System.out.println("Digite a decima nota: ");
		float nota10 = Float.parseFloat(teclado.nextLine());
		teclado.close();

		System.out.printf("A menor nota é %.2f \n", Math.min(nota10, Math.min(nota09, Math.min(nota08, Math.min(nota07,
				Math.min(nota06, Math.min(nota05, Math.min(nota04, Math.min(nota03, Math.min(nota01, nota02))))))))));

		System.out.printf("A maior nota é %.2f", Math.max(nota10, Math.max(nota09, Math.max(nota08, Math.max(nota07,
				Math.max(nota06, Math.max(nota05, Math.max(nota04, Math.max(nota03, Math.max(nota01, nota02))))))))));
	}

}
