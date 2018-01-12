package iniciante;

import java.util.Scanner;

public class TabuadaValorDigitado {
	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		int fator = 0;
		int produto = 0;

		System.out.println("Digite os valores solicitados.");

		System.out.print("Digite um número inteiro: ");
		fator = dados.nextInt();

		for (int i = 0; i <= 10; i++) {
			produto = (fator * i);
			System.out.println(fator + " * " + i + " = " + produto);
		}

	}
}
