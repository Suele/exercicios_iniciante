package iniciante;

import java.util.Scanner;

public class MaiorNumero {
	public static void main(String[] args) {

		Scanner dadosDoTeclado = new Scanner(System.in);

		System.out.println("1� n�mero: ");
		double primeiroNumero = dadosDoTeclado.nextDouble();

		System.out.println("2� n�mero: ");
		double segundoNumero = dadosDoTeclado.nextDouble();

		if (primeiroNumero > segundoNumero) {
			System.out.println("Maior: " + primeiroNumero);
		} else {
			System.out.println("Maior: " + segundoNumero);
		}

	}
}
