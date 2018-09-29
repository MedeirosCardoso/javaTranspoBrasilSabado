package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio08 {
/*Escreva um programa que solicita uma frase ao usuário e em seguida 
  apresenta apenas a primeira palavra da frase.*/
	
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase=teclado.nextLine().trim();
		teclado.close();
		System.out.printf(frase.substring(0,frase.indexOf(" ")));
	}
}
