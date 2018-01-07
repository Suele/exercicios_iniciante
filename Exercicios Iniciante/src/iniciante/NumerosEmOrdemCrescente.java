//O objetivo do algoritmo � organizar os n�meros em ordem crescente.
package iniciante;

import java.util.Scanner;

public class NumerosEmOrdemCrescente {

	public static void main(String[] args) {

		Scanner dadosUsuario = new Scanner(System.in);

		System.out.println("Por Favor Siga os passos abaixo.");
		System.out.println("Digite apenas N�meros inteiros.");
		System.out.println("");
		
		System.out.print("1� ");
		int primeiroValor = dadosUsuario.nextInt();

		System.out.print("2� ");
		int segundoValor = dadosUsuario.nextInt();

		System.out.print("3� ");
		int terceiroValor = dadosUsuario.nextInt();

		// verifica se os valores das variaveis s�o diferntes.
		if((primeiroValor != segundoValor && primeiroValor != terceiroValor) && 
				(segundoValor != primeiroValor && segundoValor != terceiroValor)) {
		
			// verifica os valores das variaveis e os coloca em ordem crescente.
			if ((primeiroValor < segundoValor && primeiroValor < terceiroValor) && (segundoValor < terceiroValor)) {
				System.out.println(" 1� " + primeiroValor + ", " + " 2� " + segundoValor + ", " + " 3� " + terceiroValor);
			} else if ((segundoValor < primeiroValor && segundoValor < terceiroValor)
					&& (primeiroValor < terceiroValor)) {
				System.out.println(" 1� " + segundoValor + ", " + " 2� " + primeiroValor + ", " + " 3� " + terceiroValor);
			} else if ((terceiroValor < primeiroValor && terceiroValor < segundoValor)
					&& (segundoValor < primeiroValor)) {
				System.out.println(" 1� " + terceiroValor + ", " + " 2� " + segundoValor + ", " + " 3� " + primeiroValor);
			} else if ((terceiroValor < primeiroValor && terceiroValor < segundoValor)
					&& (primeiroValor < segundoValor)) {
				System.out.println(" 1� " + terceiroValor + ", " + " 2� " + primeiroValor + ", " + " 3� " + segundoValor);
			} else if ((primeiroValor < segundoValor && primeiroValor < terceiroValor)
					&& (terceiroValor < segundoValor)) {
				System.out.println(" 1� " + primeiroValor + ", " + " 2� " + terceiroValor + ", " + " 3� " + segundoValor);
			} else if ((segundoValor < primeiroValor && segundoValor < terceiroValor)
					&& (terceiroValor < primeiroValor)) {
				System.out.println(" 1� " + segundoValor + ", " + " 2� " + terceiroValor + ", " + " 3� " + primeiroValor);
			}
		}else {
			System.out.println("Valores iguais n�o s�o aceitos.");
		}

	}

}
