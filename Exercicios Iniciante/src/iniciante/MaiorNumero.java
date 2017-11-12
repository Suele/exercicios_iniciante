package iniciante;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {

		Scanner dadosDoTeclado = new Scanner(System.in);

		System.out.println("1º número: ");
		double primeiroNumero = dadosDoTeclado.nextDouble();

		System.out.println("2º número: ");
		double segundoNumero = dadosDoTeclado.nextDouble();

		if (primeiroNumero > segundoNumero) {
			System.out.println("Maior: " + primeiroNumero);
		} else {
			System.out.println("Maior: " + segundoNumero);
		}

	}
}
