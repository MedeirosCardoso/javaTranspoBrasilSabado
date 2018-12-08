package br.com.cursojava.aula006.lojinha;

public class FolhaPagamento {

	public void imprimir(Funcionario funcionario) {
		System.out.println("====== FOLHA PAGAMENTO ======");
		System.out.printf("Nome: %s \n", funcionario.getNome());
		System.out.printf("Salário Base: R$ %.2f \n", funcionario.getSalarioBase());
		System.out.printf("Salário Líquido: R$ %.2f \n", funcionario.getSalarioLiquido());
		System.out.println("====== xxxxxxxxxxxxxxx ======");
	}
}
