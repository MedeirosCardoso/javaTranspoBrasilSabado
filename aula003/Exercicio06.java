package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio06 {
/*Escreva um programa que solicite o nome do usu�rio e em seguida verifique
  se o nome informado possui ao menos 3 caracteres, j� descontados os 
  espa�os em branco do in�cio e do final. Caso o nome informado possua de
  3 caracteres apresente a mensagem "Nome inv�lido", Se o nome informado passar na 
  valida��o apresente a mensagem "Bem vindo." seguido do nome informado.*/
	
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome=teclado.nextLine();
		teclado.close();
		
		if(nome.trim().length()>3){
			System.out.printf("Bem vindo %s",nome);
		}else{
			System.out.printf("Nome inv�lido!");
		}
	}
}
