/*Escreva um programa que solicite a idade do usuário e em seguida apresente o valor informado.
  Caso o usuário tenha digitado um valor negativo o programa deve apresentar uma mensagem informando 
  que o número é inválido e deve solicitar a idade novamente.*/
package br.com.cursojava.aula004;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade;
		do {
			System.out.println("Digite á sua idade:");
			idade = Integer.parseInt(teclado.nextLine());
			if(idade<0){
				System.out.println("Valor digitado é inválido!");
			}
		} while (idade < 0);
		
		System.out.println("A sua idade é " + idade);
		teclado.close();
	}

}
