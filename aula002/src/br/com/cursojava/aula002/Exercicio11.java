package br.com.cursojava.aula002;
import java.util.Scanner;
public class Exercicio11 {
	/*11) Escreva um programa que solicite a idade do usu�rio e sem seguida escreva uma mensagem 
	      informando se ele tem ou n�o idade para fazer a CNH.*/
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Digite a sua idade: ");
		int idade=Integer.parseInt(teclado.nextLine());
		teclado.close();
		if(idade>=18||idade>0){
			System.out.print("Voc� tem idade para fazer a CNH (Carteira nacional de habilita��o).");
		}else if(idade<=0){
			System.out.print("Voc� n�o digitou uma idade valida!");
		}else{
			System.out.print("Voc� ainda n�o tem idade para fazer CNH (Carteira nacional de habilita��o).");
		}
	}

}
