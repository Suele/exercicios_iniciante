// Algoritmo que mostra a idade.

package iniciante;

public class Idade {
	public static void main(String[] args) {

		int anoAtual = 2018;
		int anoNasc = 1989;

		int idadeAtual = (anoAtual - anoNasc);

		System.out.println(idadeAtual);

		if (idadeAtual >= 18) {
			System.out.println("Voc� j� � maior de idade.");
		} else {
			System.out.println("Voc� ainda � menor de idade.");
		}
	}
}
