package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio07 {
/*Escreva um programa que solicita uma frase ao usuário e em seguida
  apresenta a frase informada sem as vogais.*/
	
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase=teclado.nextLine();
		teclado.close();
		System.out.printf(frase.replace("a", "").replace("e", "").replace("i","").replaceAll("o", "").replaceAll("u", ""));
	
		
	}
}
