package br.com.cursojava.aula002;
import java.util.Scanner;
public class Exercicio16 {
/*16) Escreva um  que apresente o menu abaixo:
       1 - Depositar
       2 - Sacar
       3 - Verificar Saldo
      Em seguida conforme o número digitado apresente uma das mensagens abaixo:
      codigo: 1 mensagem: Você Escolheu a opção Depositar
      codigo: 2 mensagem: Você Escolheu a opção Sacar
      codigo: 3 mensagem: Você Escolheu a opção Verificar Saldo*/
	
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.printf("%s \n %s \n %s \n %s \n","Selecione a opção abaixo:",
				"1-Depositar","2-Sacar","3-Verificar Saldo");
		int opcao=Integer.parseInt(teclado.nextLine());
		teclado.close();
		switch (opcao){
		case 1:
			System.out.println("Codigo:"+opcao+": Você Escolheu a opção Depositar.");
			break;
		case 2:
			System.out.println("Codigo:"+opcao+": Você Escolheu a opção Sacar.");
			break;
		case 3:
			System.out.println("Codigo:"+opcao+": Você Escolheu a opção Verificar saldo.");
			break;
		default:
			System.out.println("Codigo:"+opcao+": Opção não valida!");
		}
	}
}
