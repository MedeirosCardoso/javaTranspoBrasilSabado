package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio01 {
	/*Escreva um programa que solicite a idade do usu�rio e mostre um mensagem
	  informando se o usu�rio j� pode votar ou n�o.(utilize o operador tern�rio)*/
	public static void main(String [] args){
		Scanner teclado =new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		int idade=Integer.parseInt(teclado.nextLine());
		String votar=idade>=16 ? "voc� j� pode votar" : "voc� ainda n�o pode votar ";
		System.out.printf(votar);
		teclado.close();
	}
}
