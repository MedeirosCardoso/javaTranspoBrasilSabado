package br.com.cursojava.aula002;
import java.util.Scanner;
public class NumeroElevadoDois {
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero=Integer.parseInt(teclado.nextLine());
		teclado.close();
		System.out.printf("%s %.2f","Resultado =", Math.pow(numero, 2));
	}
}
