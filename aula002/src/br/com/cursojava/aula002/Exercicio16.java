package br.com.cursojava.aula002;
import java.util.Scanner;
public class Exercicio16 {
/*16) Escreva um  que apresente o menu abaixo:
       1 - Depositar
       2 - Sacar
       3 - Verificar Saldo
      Em seguida conforme o n�mero digitado apresente uma das mensagens abaixo:
      codigo: 1 mensagem: Voc� Escolheu a op��o Depositar
      codigo: 2 mensagem: Voc� Escolheu a op��o Sacar
      codigo: 3 mensagem: Voc� Escolheu a op��o Verificar Saldo*/
	
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.printf("%s \n %s \n %s \n %s \n","Selecione a op��o abaixo:",
				"1-Depositar","2-Sacar","3-Verificar Saldo");
		int opcao=Integer.parseInt(teclado.nextLine());
		teclado.close();
		switch (opcao){
		case 1:
			System.out.println("Codigo:"+opcao+": Voc� Escolheu a op��o Depositar.");
			break;
		case 2:
			System.out.println("Codigo:"+opcao+": Voc� Escolheu a op��o Sacar.");
			break;
		case 3:
			System.out.println("Codigo:"+opcao+": Voc� Escolheu a op��o Verificar saldo.");
			break;
		default:
			System.out.println("Codigo:"+opcao+": Op��o n�o valida!");
		}
	}
}
