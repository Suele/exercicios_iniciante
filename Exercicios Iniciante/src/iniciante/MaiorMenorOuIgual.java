// Algoritmo que verifica se os valores s�o maiores, menores ou iguais.

package iniciante;

public class MaiorMenorOuIgual {

	public static void main(String[] args) {

		int primeiroNumero = 10;
		int segundoNumero = 10;

		if (primeiroNumero != segundoNumero && primeiroNumero != 0 && segundoNumero != 0) {
			if (primeiroNumero > segundoNumero) {
				System.out.println(primeiroNumero + " > " + segundoNumero);
			}
			if (segundoNumero > primeiroNumero) {
				System.out.println(segundoNumero + " > " + primeiroNumero);
			}

		} else if (primeiroNumero == segundoNumero) {
			System.out.println("Os valores n�o podem serem iguais.");
		} else if (primeiroNumero == 0) {
			System.out.println("O primeiro valor n�o pode ser zero.");
		} else if (segundoNumero == 0) {
			System.out.println("O segundo valor n�o pode ser zero.");
		} else if (primeiroNumero == 0 && segundoNumero == 0) {
			System.out.println(" Os valores n�o podem serem zero.");
		}

	}

}
