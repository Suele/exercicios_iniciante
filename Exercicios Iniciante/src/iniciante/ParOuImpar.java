package iniciante;
// Algoritmo que verifica se o n�mero digitado � par ou �mpar.

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner lerDados = new Scanner(System.in);

		System.out.println("Digite 3 valores: ");
		int primeiroNumero = 0;

		for (int i = 1; i <= 3; i++) {
			
			System.out.print(">>> ");
			primeiroNumero = lerDados.nextInt();

			if (primeiroNumero % 2 == 0) {
				System.out.println(">>> " + primeiroNumero + " � par.");
			} else {
				System.out.println(">>> " + primeiroNumero + " � �mpar.");
			}
			
			if (i == 3) {
				System.out.println(">>> Fim ");
			}
		}

	}

}
