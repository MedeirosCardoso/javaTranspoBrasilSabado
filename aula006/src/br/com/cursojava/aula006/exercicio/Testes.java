package br.com.cursojava.aula006.exercicio;

public class Testes {

	public static void main(String[] args) {
		
	//	Veiculo v1 = new Veiculo();

	//	Veiculo v2 = new Carro();
//
	//	Aviao av = new Aviao();

		//Veiculo v3 = av;
		
	}
}


/*Quais m�todos s�o poss�veis de serem chamados na refer�ncia v3?
  Pode ser chamados todos os m�todos da classe Veiculo:
  getVelocidadeAtual();
  setVelocidadeAtual(int velocidadeAtual);
  public boolean isLigado();
  public void setLigado(boolean ligado);
  public void acelerar(int valor);
  public void parar();
  public void ligar();
  public void desligar();
  
  Quais m�todos s�o poss�veis de serem chamados na refer�ncia av?
  Todos os m�todos da classe veiculo e da classe aviao.
  public void acelerar(int valor);
  public void parar();
  public void ligar();
  public void desligar();
  public void voar();
  
  if(v3 instanceof Aviao){
  	((Aviao v3)).voar();
  }
 */