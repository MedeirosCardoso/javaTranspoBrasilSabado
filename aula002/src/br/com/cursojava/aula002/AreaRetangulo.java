package br.com.cursojava.aula002;
import java.util.Scanner;
public class AreaRetangulo {
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite o valor da base do retângulo");
		float base=Float.parseFloat(teclado.nextLine());
		System.out.println("Digite o valor da altura do retângulo");
		float altura=Float.parseFloat(teclado.nextLine());
		teclado.close();
		System.out.printf("%s %.2f %s %.2f \n %s %.2f","Base:",base,"Altura",altura,"Area:",base*altura);
		System.out.printf("\n %s %.2f","Perímetro::",(base+altura)*2);
		
	}
}
