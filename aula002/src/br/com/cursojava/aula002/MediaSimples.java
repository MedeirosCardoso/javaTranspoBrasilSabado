package br.com.cursojava.aula002;
import java.util.Scanner;
public class MediaSimples {
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		float nota1=Float.parseFloat(teclado.nextLine());
		System.out.println("Digite a segunda nota: ");
		float nota2=Float.parseFloat(teclado.nextLine());
		System.out.println("Digite a terceira nota: ");
		float nota3=Float.parseFloat(teclado.nextLine());
		teclado.close();
		System.out.printf("%.2f %s %.2f %s %.2f = %.2f",nota1,"+",nota2,"+",nota3,(nota1+nota2+nota3)/3);
	}

}
