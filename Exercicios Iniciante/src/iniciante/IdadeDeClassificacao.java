//O objetivo do programa é classificar os nadadores de acordo com a idade.

package iniciante;

public class IdadeDeClassificacao {

	public static void main(String[] args) {

		// Forma mais fácil
		int idadeNadadores = 4;

		if (idadeNadadores <= 0 || idadeNadadores <= 4) {
			System.out.println("Idade Inapropiada para natação.");
		}

		if (idadeNadadores >= 5 && idadeNadadores <= 7) {
			System.out.println("Infantil A");
		}
		if (idadeNadadores >= 8 && idadeNadadores <= 10) {
			System.out.println("Infantil B");
		}
		if (idadeNadadores >= 11 && idadeNadadores <= 13) {
			System.out.println("Juvenil A");
		}
		if (idadeNadadores >= 14 && idadeNadadores <= 17) {
			System.out.println("Juvenil B");
		}
		if (idadeNadadores >= 18) {
			System.out.println("Adulto.");
		}

		// Forma mais coerente

	}

}
