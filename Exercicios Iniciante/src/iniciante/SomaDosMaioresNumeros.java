// Algoritmo que soma os dois maiores números, e qua não aceita valores repetidos.

package iniciante;

public class SomaDosMaioresNumeros {
	public static void main(String[] args) {

		// declaração das variaveis
		int primeiroValor = 0;
		int segundoValor = 0;
		int terceiroValor = 0;
		int resultado = 0;

		// atribuindo valores para as variaveis.
		primeiroValor = 0;
		segundoValor = 5;
		terceiroValor = 15;

		if ((primeiroValor != segundoValor && segundoValor != terceiroValor) && 
				(segundoValor != primeiroValor && primeiroValor != terceiroValor) 
				&& (terceiroValor != primeiroValor && primeiroValor != segundoValor)) {

			// compara os valores e soma somente as duas variaveis que possuem os maiores
			// valores.
			if (primeiroValor > segundoValor && segundoValor > terceiroValor) {
				resultado = primeiroValor + segundoValor;
				System.out.println(primeiroValor + " + " + segundoValor + " = " + resultado);
			} else if (primeiroValor > terceiroValor && terceiroValor > segundoValor) {
				resultado = primeiroValor + terceiroValor;
				System.out.println(primeiroValor + " + " + terceiroValor + " = " + resultado);
			} else if (segundoValor > primeiroValor && primeiroValor > terceiroValor) {
				resultado = segundoValor + primeiroValor;
				System.out.println(segundoValor + " + " + primeiroValor + " = " + resultado);
			} else if (segundoValor > terceiroValor && terceiroValor > primeiroValor) {
				resultado = segundoValor + terceiroValor;
				System.out.println(segundoValor + " + " + terceiroValor + " = " + resultado);
			} else if (terceiroValor > segundoValor && segundoValor > primeiroValor) {
				resultado = terceiroValor + segundoValor;
				System.out.println(terceiroValor + " + " + segundoValor + " = " + resultado);
			} else if (terceiroValor > primeiroValor && primeiroValor > segundoValor) {
				resultado = terceiroValor + primeiroValor;
				System.out.println(terceiroValor + " + " + primeiroValor + " = " + resultado);
			}

		} else {
			System.out.println("Os valores devem ser diferntes.");
		}

	}
}
