package br.com.cursojava.aula003;
import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.printf(" 1 - Cadastrar Produto. \n "
				+ "2 - Listar Produtos. \n "
				+ "3 - Pesquisar produtos. \n "
				+ "4 - Remover produto. \n "
				+ "5 - Sair. \n");
		int opc=Integer.parseInt(teclado.nextLine());
		teclado.close();
		switch (opc){
		case 1: 
			System.out.println("Você escolheu a opção Cadastrar Produto.");
			break;
		case 2:
			System.out.println("Você escolheu a opção Listar Produtos.");
			break;
		case 3: 
			System.out.println("Você escolheu a opção Pesquisar produtos.");
			break;
		case 4:
			System.out.println("Você escolheu a opção Remover produto.");
			break;
		case 5:
			System.out.println("Obrigado por usar nossos terminais de atendimento.");
			break;
		default:
			System.out.println("Opção invalida.");
			break;
		}
		
	}
}
