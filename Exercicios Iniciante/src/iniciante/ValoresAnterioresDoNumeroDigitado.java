package iniciante;

import java.util.Scanner;

public class ValoresAnterioresDoNumeroDigitado {
	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
		int numeroFinal = dados.nextInt();

		// Ordem decrecente
		if (numeroFinal != 0) {
			while (numeroFinal >= 1) {
				System.out.print(numeroFinal + "| ");
				numeroFinal--;
			}
		} else {
			System.out.println(numeroFinal + " não é aceito, digite qualquer valor que seja diferente de zero.");
		}

		System.out.println("");
		System.out.println("");

		int numero = 0;
		System.out.print("Digite outro valor inteiro: ");
		int outroNumeroFinal = dados.nextInt();

		// ordem crecente
		if (outroNumeroFinal != 0) {
			while (outroNumeroFinal >= 1) {
				numero++;
				System.out.print(numero + "| ");
				outroNumeroFinal--;

			}
		}
	}
}
