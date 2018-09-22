package br.com.cursojava.aula002;
import java.util.Scanner;
public class Exercicio14 {
	/*14) Escreva um programa que soicite a idade do usuário e 
	      apresente uma classificação de acordo com a tabela abaixo:
   		  idade >=18 "Categoria adulto"
          idade entre 14 e 17 "Categoria Juvenil"
          idade entre 12 e 13 "Categoria Infanto Juvenil"
          idade entre 9 e 11 "Categoria Infantil"
          idade menor que 9 "Categoria Mirim"  */
	
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.print("Digite a sua idade: ");
		int idade=Integer.parseInt(teclado.nextLine());
		teclado.close();
		if(idade>=18){
			System.out.printf("%s %d %s","Idade",idade,"Categoria adulto.");
		}else if(idade>=14&&idade<=17){
			System.out.printf("%s %d %s", "Idade", idade,"Categoria Juvenil.");
		}else if(idade>=12&&idade<=13){
			System.out.printf("%s %d %s", "Idade",idade,"Categoria Infanto Juvenil.");
		}else if(idade>=9&&idade<=11){
			System.out.printf("%s %d %s","Idade",idade,"Categoria infantil.");
		}else{
			System.out.printf("%s %d %s","Idade",idade,"Categoria Mirim.");
		}
	}
}
