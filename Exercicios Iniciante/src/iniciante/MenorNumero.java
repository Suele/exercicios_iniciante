package iniciante;

import java.util.Scanner;

public class MenorNumero {
	public static void main(String[] args) {

		Scanner dadosDoTeclado = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		double primeiroNumero = dadosDoTeclado.nextDouble();

		System.out.println("Digite outro n�mero: ");
		double segundoNumero = dadosDoTeclado.nextDouble();

		if (primeiroNumero < segundoNumero) {
			System.out.println("Menor: " + primeiroNumero);
		} else {
			System.out.println("Menor: " + segundoNumero);
		}
	}
}
