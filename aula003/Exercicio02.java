package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio02 {
	/*Escreva um programa que solicite o valor do sal�rio do usu�rio e em seguida apresente uma mensagem
	  informando se o usu�rio � isento do imposto de renda ou n�o. Considere isento o usu�rio que possuir
	  um sal�rio de at� R$1800,00.(utilize o operador tern�rio)*/
	public static void main(String[] args){
		Scanner teclado =new Scanner (System.in);
		System.out.println("Digite o valor do seu sal�rio: ");
		float salario=Float.parseFloat(teclado.nextLine());
		String ir=salario <=1800.00 ? "Voc� � isento do imposto de renda" : "voc� n�o � isento do imposto de renda";
		System.out.println(ir);
		teclado.close();
	}
}
