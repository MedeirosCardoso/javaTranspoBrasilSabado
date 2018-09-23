package br.com.cursojava.aula002;
import java.util.Scanner;
public class Exercicio15 {
	/*15) Escreva um  que solicite o valor do salário de uma pessoa. Em seguida o programa  deve calcular
	 	  o valor de desconto do inss (11%). Caso o salário com o desconto do inss já   aplicado seja maior que 1800, deve-se aplicar a seguinte tabela de descontos IR.
          A) Salário maior que 1800 e menor ou igual 2400 percentual IR = 7.5%
          B) Salário maior que 2400 e menor ou igual 3600 percentual IR = 24%
          c) Salário superior a 3600 percentual IR = 32%
          Ao final o  deve apresentar o valor do salario inicial, o valor do desconto do
          inss, o valor e o percentual do desconto de IR e o valor do salário Líquido.*/
	
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Digite o valor do seu salário:");
		float salarioInicial=Float.parseFloat(teclado.nextLine());
		teclado.close();
		float valorDescInss=salarioInicial*((float)11/100);
		float salarioDescInss=salarioInicial-valorDescInss;
		float ir = 0;
		float valorIr = 0;
		float salarioLiquido = 0;
		if(salarioDescInss>1800 && salarioDescInss<=2400){
			ir=7.5f;
			valorIr=salarioDescInss*(ir/100);
			salarioLiquido=salarioDescInss-valorIr;
		}else if(((salarioInicial-valorDescInss)>2400) && ((salarioInicial-valorDescInss)<=3600)){
			ir=24;
			valorIr=(float)((salarioInicial-valorDescInss)*ir/100);
			salarioLiquido=salarioInicial-valorDescInss-valorIr;
		}else if(salarioDescInss>3600){
			ir=32;
			valorIr=(float)((salarioInicial-valorDescInss)*ir/100);
			salarioLiquido=salarioInicial-valorDescInss-valorIr;
		}else{
			ir=0;
			valorIr=0;
			salarioLiquido=salarioDescInss;
		}
		System.out.printf("%s %s %.2f \n %s %s %.2f \n %s %.0f %s \n %s %s %.2f \n %s %s %.2f \n",
				"Salário Bruto:","R$",salarioInicial,"Desconto INSS:","R$",valorDescInss,"Percentual IR:",ir,"%",
				"Valor do desconto de IR:","R$",valorIr,"Salário Líquido:","R$",salarioLiquido);
	}
}
