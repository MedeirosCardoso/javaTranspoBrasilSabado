package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio02 {
	/*Escreva um programa que solicite o valor do salário do usuário e em seguida apresente uma mensagem
	  informando se o usuário é isento do imposto de renda ou não. Considere isento o usuário que possuir
	  um salário de até R$1800,00.(utilize o operador ternário)*/
	public static void main(String[] args){
		Scanner teclado =new Scanner (System.in);
		System.out.println("Digite o valor do seu salário: ");
		float salario=Float.parseFloat(teclado.nextLine());
		String ir=salario <=1800.00 ? "Você é isento do imposto de renda" : "você não é isento do imposto de renda";
		System.out.println(ir);
		teclado.close();
	}
}
