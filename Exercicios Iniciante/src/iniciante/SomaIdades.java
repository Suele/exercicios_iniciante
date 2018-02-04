//Algoritmo que soma o total de pessoas que tenham 21 e 50 anos.

package iniciante;

import java.util.Scanner;

public class SomaIdades {
	public static void main(String[] args) {

		Scanner lerDados = new Scanner(System.in);

		int contadorVinteUm = 0;
		int contadorCinquenta = 0;
		int idade = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite a idade: ");
			idade = lerDados.nextInt();
			
			if (idade <= 21) {
				contadorVinteUm += 1;
			} else if (idade >= 50) {
				contadorCinquenta += 1;
			}
		}

		System.out.println("21 - " + contadorVinteUm);
		System.out.println("50 - " + contadorCinquenta);

	}

}
