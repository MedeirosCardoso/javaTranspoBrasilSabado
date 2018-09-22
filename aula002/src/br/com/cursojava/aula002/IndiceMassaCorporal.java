package br.com.cursojava.aula002;
import java.util.Scanner;
public class IndiceMassaCorporal {
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite seu peso: ");
		float pesoKg=Float.parseFloat(teclado.nextLine());
		System.out.println("Digite a sua altura: ");
		float alturaCm=Float.parseFloat(teclado.nextLine());
		teclado.close();
		System.out.printf("%s %.2f %s %.2f \n %s %.2f %s","Peso: ",pesoKg,"Altura:",alturaCm,"IMC: ",pesoKg/(alturaCm*alturaCm),"%");
	}
}
