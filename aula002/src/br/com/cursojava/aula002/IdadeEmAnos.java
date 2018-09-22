package br.com.cursojava.aula002;
import java.util.Scanner;
public class IdadeEmAnos {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite a sua idade em anos: ");
		int idade=Integer.parseInt(teclado.nextLine());
		teclado.close();
		System.out.printf("%s %d","A sua idade em dias é ",idade*365);
	}

}
