package br.com.cursojava.aula001;

public class Porcentagem {

	public static void main(String[] args) {
		float valorEmPorcento=(float)13.5;
		float valorSobre=(float)870.50;
		
		System.out.printf("%s %.2f %n ","13,5% sobre 870,50 =",valorSobre*(valorEmPorcento/100));

	}

}
