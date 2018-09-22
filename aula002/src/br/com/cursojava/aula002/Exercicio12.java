package br.com.cursojava.aula002;
import java.util.Scanner;
public class Exercicio12 {
/*12) Escreva um programa que solicite 4 notas e em seguida calcule a média das notas.
   O programa deve apresentar uma mensagem para o usuário de acordo com o valor da média, conforme a tabela abaixo:
   Se MÉDIA maior ou igual a 9 a mensagem deve ser Conceito A
   Se MÉDIA maior ou igual a 8 e MÉDIA menor que 9 a mensagem deve ser Conceito B
   Se MÉDIA maior ou igual a 6 e MÉDIA menor que 8 a mensagem deve ser Conceito C
   Se MÉDIA maior ou igual a 5 e MÉDIA menor que 6 a mensagem deve ser Conceito D
   Se nota for menor que 5 a mensagem deve ser "Insuficiente"*/

	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Digite a primeira nota:");
		float notaUm=Float.parseFloat(teclado.nextLine());
		System.out.print("Digite a segunda nota: ");
		float notaDois=Float.parseFloat(teclado.nextLine());
		System.out.print("Digite a terceira nota: ");
		float notaTres=Float.parseFloat(teclado.nextLine());
		System.out.print("Digite a quarta nota: ");
		float notaQuatro=Float.parseFloat(teclado.nextLine());
		teclado.close();
		float media=(notaUm+notaDois+notaTres+notaQuatro)/4;
		if(media>=9){
			System.out.printf("%s %.2f %s","Média:",media,"Conceito A.");
		}else if(media>=8&media<9){
			System.out.printf("%s %.2f %s","Média:",media,"Conceito B.");
		}else if(media>=6&media<8){
			System.out.printf("%s %.2f %s","Média:",media,"Conceito C.");
		}else if(media>=5&media<6){
			System.out.printf("%s %.2f %s","Média:",media,"Conceito D.");
		}else{
			System.out.printf("%s %.2f %s","Média:",media,"Insuficiente.");
		}
	}
}
