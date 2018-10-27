package br.com.cursojava.aula006.exercicio;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args){
		Scanner teclado= new Scanner(System.in);
		Cadastro cadastro = new Cadastro();
		
		cadastro.mostrarMenu(teclado);
		teclado.close();
	}
}
