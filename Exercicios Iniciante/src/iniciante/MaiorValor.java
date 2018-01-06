//Algoritmo que mostra o maior valor digitado.

package iniciante;

public class MaiorValor {
	public static void main(String[] args) {

		int primeiroValor = 3;
		int segundoValor = 6;
		int terceiroValor = 14;

		int valorMaior = 0;

		// se os valores forem diferntes, verifica qual é maior.
		if (primeiroValor != segundoValor && primeiroValor != terceiroValor && segundoValor != primeiroValor
				&& segundoValor != terceiroValor) {
			if (primeiroValor > segundoValor && primeiroValor > terceiroValor) {
				valorMaior = primeiroValor;
			} else if (segundoValor > primeiroValor && segundoValor > terceiroValor) {
				valorMaior = segundoValor;
			} else if (terceiroValor > primeiroValor && terceiroValor > segundoValor) {
				valorMaior = terceiroValor;
			}
		} else {
			System.out.println("Valores iguais não são aceitos.");
		}

		System.out.println("Maior valor: " + valorMaior);

	}
}
