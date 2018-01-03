//Algoritmo calcula a idade em dias, meses e anos de uma pessoa.

package iniciante;

public class IdadeEmDiasMesesEAnos {
	public static void main(String[] args) {

		int anoDeNasc = 2003;
		int anoAtual = 2018;

		int idadeAtual = anoAtual - anoDeNasc;

		int idadeMeses = (idadeAtual * 12);

		double idadeDias = (idadeAtual * 365);

		System.out.println("Idade Atual: " + idadeAtual);

		System.out.println("Idade em meses: " + idadeMeses);

		System.out.println("Idade em Dias: " + idadeDias);
	}
}
