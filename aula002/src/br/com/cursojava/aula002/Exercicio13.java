package br.com.cursojava.aula002;
import java.util.Scanner;
public class Exercicio13 {
     /*13) Escreva um programa que solicite um número inteiro ao usuário e 
           em seguida escreva uma mensagem informando se o número digitado é PAR ou IMPAR.*/
	
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int numero=Integer.parseInt(teclado.nextLine());
		teclado.close();
			if(numero%2==0){
				System.out.printf("%d %s",numero,"é PAR.");
			}else{
				System.out.printf("%d %s", numero,"é IMPAR.");
			}	
	}
}
