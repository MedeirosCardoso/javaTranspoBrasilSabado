/*Escreva um programa que solicite a idade do usu�rio e em seguida apresente o valor informado.
  Caso o usu�rio tenha digitado um valor negativo o programa deve apresentar uma mensagem informando 
  que o n�mero � inv�lido e deve solicitar a idade novamente.*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade;
		do {
			System.out.println("Digite � sua idade:");
			idade = Integer.parseInt(teclado.nextLine());
			if(idade<0){
				System.out.println("Valor digitado � inv�lido!");
			}
		} while (idade < 0);
		
		System.out.println("A sua idade � " + idade);
		teclado.close();
	}

}
