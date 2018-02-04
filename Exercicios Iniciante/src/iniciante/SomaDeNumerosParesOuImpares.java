// Algoritmo que soma dois valores digitados e verifica se o total é par ou Ímpar.

package iniciante;

public class SomaDeNumerosParesOuImpares {

	public static void main(String[] args) {

		int primiroNumero = 11;
		int segundoNumero = 11;
		int total = (primiroNumero + segundoNumero);

		if (total != 0) {
			if (total % 2 == 0) {
				System.out.println("Total é par: " + total);
			} else {
				System.out.println("Total é ímpar: " + total);
			}
		} else {
			System.out.println("Zero é um número neutro, por favor digite outro valor.");
		}
	}

}
