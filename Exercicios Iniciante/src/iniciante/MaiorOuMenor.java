//Compara os valores das variaveis.

package iniciante;

import java.util.Scanner;

public class MaiorOuMenor {
	public static void main(String[] args) {

		Scanner lerDados = new Scanner(System.in);

		System.out.println(" Siga os passos abaixo. ");
		System.out.println("");

		System.out.print(" Digite o primeiro n�mero: ");
		int primeiroNumero = lerDados.nextInt();

		System.out.print(" Digite o segundo n�mero: ");
		int segundoNumero = lerDados.nextInt();
		
		System.out.println("");

		if (primeiroNumero == segundoNumero) {
			System.out.print("### Os n�meros s�o iguais.");
		} else if (segundoNumero != primeiroNumero) {
			System.out.println(" ### Os n�meros s�o diferentes.");

			if (primeiroNumero > segundoNumero) {
				System.out.println(" ### " + primeiroNumero + " > " + segundoNumero);
			}else {
				System.out.println(" ### " + segundoNumero + " > " + primeiroNumero);
			}
		}

	}
}
