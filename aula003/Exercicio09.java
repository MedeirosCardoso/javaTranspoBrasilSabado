package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio09 {
/*Escreva um programa que solicita uma frase ao usu�rio e em seguida
  apresenta apenas a �ltima palavra.*/
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = teclado.nextLine().trim();
		teclado.close();
		//System.out.printf(frase.substring(frase.lastIndexOf(" ")));
		
		int index=frase.lastIndexOf(" ");
		System.out.println(frase.substring(index+1));
	}
}
