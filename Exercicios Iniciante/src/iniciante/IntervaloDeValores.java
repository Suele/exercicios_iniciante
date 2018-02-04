package iniciante;

import java.util.Scanner;

public class IntervaloDeValores {

	public static void main(String[] args) {

		Scanner lerDados = new Scanner(System.in);

		System.out.println("Digite a quantidade de números a ser analisadas.");
		int numero = lerDados.nextInt();

		while (numero >= 1) {
			System.out.print("Digite o  " + numero + "º ");
			int numeroIntervalo = lerDados.nextInt();

			if (numeroIntervalo >= 1 && numeroIntervalo <= 4) {
				System.out.println(numeroIntervalo);
			} else {
				System.out.println("Valor invalido.");
			}

			numero--;
		}

	}

}
