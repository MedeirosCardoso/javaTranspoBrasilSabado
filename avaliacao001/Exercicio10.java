/*Escreva um programa que solicite a idade, altura e o peso de uma pessoa e em seguida calcule o IMC utilizando a fórmula
 * IMC=peso/(altura*altura). O programa deve apresentar uma mensagem informando se o IMC esta baixo, normal, ou obeso de
 * acordo com a tabela abaixo:
 * Entre 17 e 18,49   - Abaixo do peso.
 * Entre 18,5 e 24,99 - Peso normal.
 * Entre 25 e 29,99   - Acima do peso.
 * Entre 30 e 34,99   - Obesidade I.
 * Entre 35 e 39,99   - Obesidade II (severa).
 * Acima de 40        - obesidade III (mórbida).*/
package br.com.cursojava.avaliacao001;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		int idade=Integer.parseInt(teclado.nextLine());
		System.out.println("Digite a sua altura: ");
		float altura=Float.parseFloat(teclado.nextLine());
		System.out.println("Digite seu peso: ");
		float peso=Float.parseFloat(teclado.nextLine());
		teclado.close();
		float imc=peso/(altura*altura);
		
	}

}
