// Algoritmo que efetua a divis�o de duas variaveis sendo a segund

package iniciante;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {

		Scanner dadosUsuario = new Scanner(System.in);

		int primeiroValor = 0;
		int segundoValor = 1;
		double resultadoDivisao = 0;
		double restoDivisao = 0;

		System.out.println("Siga os passos solicitados.");
		System.out.println("Digite dois valores.");

		System.out.print("1� valor: ");
		primeiroValor = dadosUsuario.nextInt();

		System.out.print("2� valor: ");
		segundoValor = dadosUsuario.nextInt();

		if (segundoValor == 0) {
			System.out.println("O valor informado n�o � valido, por favor digite um valor diferente de zero.");
			System.out.println("2� valor: ");
			segundoValor = dadosUsuario.nextInt();
		}

		if (segundoValor != 0) {
			resultadoDivisao = (primeiroValor / segundoValor);
			restoDivisao = (primeiroValor % segundoValor);
			System.out.println("Resultado: " + resultadoDivisao);
			System.out.println("Resto da divis�o: " + restoDivisao);
		} else {
			System.out.println("Valores Informados incorretos.");
		}
	}

}
