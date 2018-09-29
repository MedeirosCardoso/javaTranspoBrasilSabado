package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio12 {
/*Escreva um programa que solicita uma frase e em seguida apresente
  a frase digitada metade em caixa baixa e a outra metada em caixa alta.*/
	
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase=teclado.nextLine();
		teclado.close();
		System.out.printf(frase.substring(0,frase.length()/2).toLowerCase() + 
				frase.substring(frase.length()/2,frase.length()).toUpperCase());
	}
}
