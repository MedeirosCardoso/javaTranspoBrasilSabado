package br.com.cursojava.aula002;
import java.util.Scanner;
public class Exercicio13 {
     /*13) Escreva um programa que solicite um n�mero inteiro ao usu�rio e 
           em seguida escreva uma mensagem informando se o n�mero digitado � PAR ou IMPAR.*/
	
	public static void main(String[]args){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int numero=Integer.parseInt(teclado.nextLine());
		teclado.close();
			if(numero%2==0){
				System.out.printf("%d %s",numero,"� PAR.");
			}else{
				System.out.printf("%d %s", numero,"� IMPAR.");
			}	
	}
}
