//Algoritmo verifica se os n�meros digitados s�o maior, menor, diferente ou iguais.

package iniciante;

public class MaiorMenorOuIgual {
	public static void main(String[] args) {

		int primeiroNumero = 1;
		int segundoNumero = 1;

		if (primeiroNumero != segundoNumero) {
			System.out.println(primeiroNumero + " != " + segundoNumero);
		} else {
			System.out.println(primeiroNumero + " == " + segundoNumero);
		}

		if (primeiroNumero > segundoNumero) {
			System.out.println(primeiroNumero + " > " + segundoNumero);
		}else {
			System.out.println(segundoNumero + " > " + primeiroNumero);
		}

	}
}
