//

package iniciante;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {

		Scanner lerDados = new Scanner(System.in);

		int controle = 1;
		double divisor = 0;
		double quociente = 1;
		double resultadoDivisao = 0;

		while (controle <= 4) {

			System.out.print("divisor: ");
			divisor = lerDados.nextInt();

			System.out.print("quociente: ");
			quociente = lerDados.nextInt();

			if (quociente > 0) {
				resultadoDivisao = (divisor / quociente);
			} else {
				System.out.println("O quociente tem que ser maior que zero.");
				System.out.print("quociente: ");
				quociente = lerDados.nextInt();
				resultadoDivisao = (divisor / quociente);
			}

			System.out.println(">>> " + divisor + " / " + quociente + " = " + resultadoDivisao);

			System.out.println("");

			if (controle == 4) {
				System.out.println("Fim");
			}
			controle++;
		}

	}

}
