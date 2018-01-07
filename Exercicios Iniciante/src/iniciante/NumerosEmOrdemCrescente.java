//O objetivo do algoritmo é organizar os números em ordem crescente.
package iniciante;

import java.util.Scanner;

public class NumerosEmOrdemCrescente {

	public static void main(String[] args) {

		Scanner dadosUsuario = new Scanner(System.in);

		System.out.println("Por Favor Siga os passos abaixo.");
		System.out.println("Digite apenas Números inteiros.");
		System.out.println("");
		
		System.out.print("1º ");
		int primeiroValor = dadosUsuario.nextInt();

		System.out.print("2º ");
		int segundoValor = dadosUsuario.nextInt();

		System.out.print("3º ");
		int terceiroValor = dadosUsuario.nextInt();

		// verifica se os valores das variaveis são diferntes.
		if((primeiroValor != segundoValor && primeiroValor != terceiroValor) && 
				(segundoValor != primeiroValor && segundoValor != terceiroValor)) {
		
			// verifica os valores das variaveis e os coloca em ordem crescente.
			if ((primeiroValor < segundoValor && primeiroValor < terceiroValor) && (segundoValor < terceiroValor)) {
				System.out.println(" 1º " + primeiroValor + ", " + " 2º " + segundoValor + ", " + " 3º " + terceiroValor);
			} else if ((segundoValor < primeiroValor && segundoValor < terceiroValor)
					&& (primeiroValor < terceiroValor)) {
				System.out.println(" 1º " + segundoValor + ", " + " 2º " + primeiroValor + ", " + " 3º " + terceiroValor);
			} else if ((terceiroValor < primeiroValor && terceiroValor < segundoValor)
					&& (segundoValor < primeiroValor)) {
				System.out.println(" 1º " + terceiroValor + ", " + " 2º " + segundoValor + ", " + " 3º " + primeiroValor);
			} else if ((terceiroValor < primeiroValor && terceiroValor < segundoValor)
					&& (primeiroValor < segundoValor)) {
				System.out.println(" 1º " + terceiroValor + ", " + " 2º " + primeiroValor + ", " + " 3º " + segundoValor);
			} else if ((primeiroValor < segundoValor && primeiroValor < terceiroValor)
					&& (terceiroValor < segundoValor)) {
				System.out.println(" 1º " + primeiroValor + ", " + " 2º " + terceiroValor + ", " + " 3º " + segundoValor);
			} else if ((segundoValor < primeiroValor && segundoValor < terceiroValor)
					&& (terceiroValor < primeiroValor)) {
				System.out.println(" 1º " + segundoValor + ", " + " 2º " + terceiroValor + ", " + " 3º " + primeiroValor);
			}
		}else {
			System.out.println("Valores iguais não são aceitos.");
		}

	}

}
