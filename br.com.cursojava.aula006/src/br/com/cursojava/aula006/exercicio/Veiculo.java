package br.com.cursojava.aula006.exercicio;

public class Veiculo {
	
	private int velocidadeAtual;
	private boolean ligado;

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void acelerar(int valor) {
		if(isLigado()){
			setVelocidadeAtual(getVelocidadeAtual()+valor);	
		}else{
			System.out.println("O veiculo está desligado!");
		}
	}

	public void parar() {
		setVelocidadeAtual(0);
	}

	public void ligar() {
		setLigado(true);
	}

	public void desligar() {
		setLigado(false);
	}
}
