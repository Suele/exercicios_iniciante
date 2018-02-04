// Algoritmo que mostra a idade.

package iniciante;

public class Idade {
	public static void main(String[] args) {

		int anoAtual = 2018;
		int anoNasc = 1989;

		int idadeAtual = (anoAtual - anoNasc);

		System.out.println(idadeAtual);

		if (idadeAtual >= 18) {
			System.out.println("Você já é maior de idade.");
		} else {
			System.out.println("Você ainda é menor de idade.");
		}
	}
}
