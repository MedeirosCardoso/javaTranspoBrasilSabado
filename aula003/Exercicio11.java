package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio11 {
/*Escreva um programa que solicita um palavra e em seguida apresente a palavra
  digitada em caixa alta e em caixa baixa.*/
	
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra=teclado.nextLine();
		teclado.close();
		System.out.printf("%s em caixa baixa: %s \n",palavra,palavra.toLowerCase());
		System.out.printf("%s em caixa alta: %s",palavra,palavra.toUpperCase());
	}
}
