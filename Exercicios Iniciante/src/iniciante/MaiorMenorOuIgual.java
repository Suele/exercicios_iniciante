//Algoritmo verifica se os n�meros digitados s�o maior, menor, diferente ou iguais.

package iniciante;

public class MaiorMenorOuIgual {
	public static void main(String[] args) {

		int primeiroNumero = 5;
		int segundoNumero = 3;

		if (primeiroNumero != segundoNumero) {
			System.out.println(primeiroNumero + " != " + segundoNumero);
		}
		if (primeiroNumero == segundoNumero) {
			System.out.println(primeiroNumero + " == " + segundoNumero);
		}
		if (primeiroNumero > segundoNumero) {
			System.out.println(primeiroNumero + " > " + segundoNumero);
		}
		if (segundoNumero > primeiroNumero) {
			System.out.println(segundoNumero + " > " + primeiroNumero);
		}
		
		//Quando o if for false � executado apenas um dos blocos if else, mesmo que outra condi��o seja true.

		if (primeiroNumero == segundoNumero) {
			System.out.println("Os N�meros s�o iguais.");
		} else if (primeiroNumero > segundoNumero) {
			System.out.println(primeiroNumero + " > " + segundoNumero);
		} else if (segundoNumero > primeiroNumero) {
			System.out.println(segundoNumero + " > " + primeiroNumero);
		} else if (primeiroNumero != segundoNumero) {
			System.out.println(primeiroNumero + " != " + segundoNumero);
		}
		
		

	}
}
