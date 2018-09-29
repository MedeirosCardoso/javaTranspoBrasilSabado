package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio05 {
/*Escreva um programa que solicite o nome do usuário e em seguida informe
  a quantidade de caracteres do nome informado*/
	
	public static void main(String [] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome=teclado.nextLine();
		teclado.close();
		System.out.printf("O nome %s tem %d caracteres.", nome,nome.length());
	}
}
