package br.com.cursojava.aula002;
import java.util.Scanner;
public class MaiorMenorNota {
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		float notaUm=Float.parseFloat(teclado.nextLine());
		System.out.print("Digite a segunda nota: ");
		float notaDois=Float.parseFloat(teclado.nextLine());
		System.out.print("Digite a terceira nota: ");
		float notaTres=Float.parseFloat(teclado.nextLine());
		teclado.close();
		System.out.printf("%s %.2f \n","A maior nota é",Math.max(notaTres, Math.max(notaUm, notaDois)));
		System.out.printf("%s %.2f","A menor nota é",Math.min(notaTres,Math.min(notaUm, notaDois)));
	}
}
