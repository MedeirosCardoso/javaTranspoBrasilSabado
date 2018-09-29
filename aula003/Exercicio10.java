package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio10 {
/*Escreva um programa que solicita uma palavra e em seguida escreva
  um mensagem informando se a palavra informada possui a letra 'l' ou 'L'*/
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = teclado.nextLine();
		teclado.close();
		if(palavra.trim().contains("l")){
			System.out.printf("A palavra %s possui a letra 'l'",palavra);
		}else if(palavra.trim().contains("L")){
			System.out.printf("A palavra %s possui a letra 'L'",palavra);
		}else{
			System.out.printf("A palavra %s não possui a letra", palavra);
		}
	}
}
