// Algoritmo que efetua a divis�o de duas variaveis sendo a segund

package iniciante;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {

		/*Scanner dadosUsuario = new Scanner(System.in);

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
*/
		// Com o loop for
		Scanner dados = new Scanner(System.in);

		int divisor = 0;
		int dividendo = 1;
		double resultadoDivisao = 0.0;
		double restoDivisao = 0.0;

		System.out.println("Siga os passos abaixo.");
		System.out.println("Digite");

		for (int i = 1; i <= 2; i++) {
			if (i == 1) {
				System.out.println(i + "�" + " valor: ");
				divisor = dados.nextInt();
			}
			if (i == 2) {
				System.out.println(i + "�" + " valor: ");
				dividendo = dados.nextInt();
			}

			if (dividendo == 0) {
				System.out.println("O segundo valor informado � invalido.");
				dividendo = dados.nextInt();
			}
		}
		if (dividendo != 0) {
			resultadoDivisao = (divisor / dividendo);
			restoDivisao = (divisor % dividendo);

			System.out.println(divisor + "/" + dividendo + " = " + resultadoDivisao);
			System.out.println(divisor + "%" + dividendo + " = " + restoDivisao);
		} else {
			System.out.println("Os valores informados s�o incorretos.");
		}
		
		
	}

}
