//Faça um programa que receba 4 valores e retorne o menor entre eles.

package iniciante;

import java.util.Scanner;

public class MenorNumeroComQuatroValores {
	public static void main(String[] args) {

		Scanner dadosDoTeclado = new Scanner(System.in);

		System.out.println("Digite 4 valores.");

		System.out.print("1º valor: " + "\n");
		double primeiroValor = dadosDoTeclado.nextDouble();

		System.out.print("2º valor: " + "\n");
		double segundoValor = dadosDoTeclado.nextDouble();

		System.out.print("3º valor: " + "\n");
		double terceiroValor = dadosDoTeclado.nextDouble();

		System.out.print("4º valor: " + "\n");
		double quartoValor = dadosDoTeclado.nextDouble();

		double menorValor = 0;

		// primeiroValor
		if (primeiroValor < segundoValor) {
			menorValor = primeiroValor;
		} else {
			if (primeiroValor < terceiroValor) {
				menorValor = primeiroValor;
			}
			if (primeiroValor < quartoValor) {
				menorValor = primeiroValor;
			}

			// segundoValor
			if (segundoValor < primeiroValor) {
				menorValor = segundoValor;
			}
			if (segundoValor < terceiroValor) {
				menorValor = segundoValor;
			}
			if (segundoValor < quartoValor) {
				menorValor = segundoValor;
			}

			// terceiroValor
			if (terceiroValor < primeiroValor) {
				menorValor = terceiroValor;
			}
			if (terceiroValor < segundoValor) {
				menorValor = terceiroValor;
			}
			if (terceiroValor < quartoValor) {
				menorValor = terceiroValor;
			}

			// quartoValor
			if (quartoValor < primeiroValor) {
				menorValor = quartoValor;
			}
			if (quartoValor < segundoValor) {
				menorValor = quartoValor;
			}
			if (quartoValor < terceiroValor) {
				menorValor = quartoValor;
			}
		}

		System.out.print("\n" + "Menor valor: " + menorValor);
	}
}
