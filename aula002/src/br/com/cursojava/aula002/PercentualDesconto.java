package br.com.cursojava.aula002;
import java.util.Scanner;
public class PercentualDesconto {
	public static void main(String [] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite o valor do produto:");
		float valorProduto=Float.parseFloat(teclado.nextLine());
		System.out.print("Digite o percentual de desconto:" + " %");
		float percentualDesconto=Float.parseFloat(teclado.nextLine());
		System.out.printf("%s %.2f \n","Valor do desconto:",valorProduto*(percentualDesconto/100));
		System.out.printf("%s %.2f","Valor do produto com o desconto:",valorProduto-(valorProduto*(percentualDesconto/100)));
		teclado.close();
	}
}
