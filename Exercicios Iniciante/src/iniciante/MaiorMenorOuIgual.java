// Algoritmo que verifica se os valores são maiores, menores ou iguais.

package iniciante;

public class MaiorMenorOuIgual {

	public static void main(String[] args) {

		int primeiroNumero = 10;
		int segundoNumero = 10;

		if (primeiroNumero != segundoNumero) {
			if (primeiroNumero > segundoNumero) {
				System.out.println(primeiroNumero + " > " + segundoNumero);
			}
			if (segundoNumero > primeiroNumero) {
				System.out.println(segundoNumero + " > " + primeiroNumero);
			}

		} else {
			System.out.println("Os valores devem ser diferentes.");
		}

	}

}
