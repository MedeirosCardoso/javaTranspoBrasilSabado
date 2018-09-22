package br.com.cursojava.aula002;
import java.util.Scanner;
public class Exercicio10 {
	/*10) Escreva um programa que solicite 3 notas e em seguida calcule a média das notas. 
	 Se a média for maior ou igual a 7 escreva a mensagem
    "Aprovado" senão escreva a mensagem "Reprovado".*/
	public static void main(String [] args){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		float notaUm=Float.parseFloat(teclado.nextLine());
		System.out.print("Digite a segunda nota: ");
		float notaDois=Float.parseFloat(teclado.nextLine());
		System.out.print("Digite a terceira nota: ");
		float notaTres=Float.parseFloat(teclado.nextLine());
		teclado.close();
		float media=(notaUm+notaDois+notaTres)/3;
		if(media>=7){
			System.out.printf("%s %.2f %s","Media:",media,"Aprovado");
		}else{
			System.out.printf("%s %.2f %s","Média:",media,"Reprovado");
		}
	}
}