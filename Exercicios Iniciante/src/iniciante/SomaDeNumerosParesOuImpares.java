// Algoritmo que soma dois valores digitados e verifica se o total � par ou �mpar.

package iniciante;

public class SomaDeNumerosParesOuImpares {

	public static void main(String[] args) {

		int primiroNumero = 11;
		int segundoNumero = 11;
		int total = (primiroNumero + segundoNumero);

		if (total != 0) {
			if (total % 2 == 0) {
				System.out.println("Total � par: " + total);
			} else {
				System.out.println("Total � �mpar: " + total);
			}
		} else {
			System.out.println("Zero � um n�mero neutro, por favor digite outro valor.");
		}
	}

}
