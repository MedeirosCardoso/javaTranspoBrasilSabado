package br.com.cursojava.aula002;
import java.util.Scanner;
public class Exercicio17 {
/*17) Crie um programa que solicite o nome do usu�rio e em seguida verifique se o nome informado possui ao menos 3 letras. (String.length())
      Se o nome possuir menos que 3 letras apresente uma mensagem informando que o nome inform�do � inv�lido.*/

	public static void main(String[] argas){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome=teclado.nextLine();
		teclado.close();
		if(nome.length()<3){
			System.out.println("O nome digitado � inv�lido!");
		}else{
			System.out.println("O nome digitado � valido!");
		}
	}
}
