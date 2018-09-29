package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio01 {
	/*Escreva um programa que solicite a idade do usuário e mostre um mensagem
	  informando se o usuário já pode votar ou não.(utilize o operador ternário)*/
	public static void main(String [] args){
		Scanner teclado =new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		int idade=Integer.parseInt(teclado.nextLine());
		String votar=idade>=16 ? "você já pode votar" : "você ainda não pode votar ";
		System.out.printf(votar);
		teclado.close();
	}
}
