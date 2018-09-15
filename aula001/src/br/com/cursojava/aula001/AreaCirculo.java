package br.com.cursojava.aula001;

public class AreaCirculo {
	public static void main(String[] argas){
		int diametro=20;
		float pi=(float) 3.1416;
		
		System.out.printf("%s %s %d %s %d %s %.2f","Área do círculo:","Diametro=",diametro,", Raio=",diametro/2,", Área=",pi*((diametro/2)*(diametro/2)));
	}
}
