package br.com.cursojava.aula001;

public class AreaCirculo {
	public static void main(String[] argas){
		int diametro=20;
		float pi=(float) 3.1416;
		
		System.out.printf("%s %s %d %s %d %s %.2f","�rea do c�rculo:","Diametro=",diametro,", Raio=",diametro/2,", �rea=",pi*((diametro/2)*(diametro/2)));
	}
}
