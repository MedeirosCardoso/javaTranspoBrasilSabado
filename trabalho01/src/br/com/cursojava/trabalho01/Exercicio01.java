/*Crie um programa que leia o nome e as notas de 10 alunos, em seguida apresente o nome e a nota do aluno
  com a maior nota e do aluno com a menor nota. Os nomes e as notas devem ser armazenados em um array*/
package br.com.cursojava.trabalho01;

public class Exercicio01 {
	public static void main(String[] args) {

		String[] nomes = { "Aluno01", "Aluno02", "Aluno03", "Aluno04", "Aluno05", "Aluno06", "Aluno07", "Aluno08",
				"Aluno09", "Aluno10" };

		float[] notas = { 8, 7, 6, 10, 7.5f, 9.3f, 2, 8.1f, 5, 3.3f };

		float maiorNota = notas[0];
		float menorNota = notas[0];
		int indiceAlunoMaiorNota = 0;
		int indiceAlunoMenorNota = 0;

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
				indiceAlunoMaiorNota = i;
			}
			if (notas[i] < menorNota) {
				menorNota = notas[i];
				indiceAlunoMenorNota = i;
			}
		}

		System.out.printf("O aluno %s tem a maior nota  %.2f \n", nomes[indiceAlunoMaiorNota], maiorNota);
		System.out.printf("O aluno %s tem a menor nota  %.2f \n", nomes[indiceAlunoMenorNota], menorNota);
	}
}
