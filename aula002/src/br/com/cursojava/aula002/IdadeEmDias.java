package br.com.cursojava.aula002;
import java.util.Scanner;
public class IdadeEmDias {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite a sua idade em dias: ");
		int idadeEmDias=Integer.parseInt(teclado.nextLine());
		teclado.close();
		System.out.printf("%d %s %d %s %d %s",idadeEmDias/360,"Anos,",(idadeEmDias%360)/30,"Mês,",idadeEmDias%30,"Dias");
	}

}
