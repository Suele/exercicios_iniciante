package iniciante;

import java.util.Scanner;

public class MaiorMenorEIgual {
	public static void main(String[] args) {

		Scanner dadosDigitados = new Scanner(System.in);

		System.out.println("Digite dois valores.");

		System.out.println("1� valor: ");
		int primeiroValor = dadosDigitados.nextInt();

		System.out.println("2� valor: ");
		int segundoValor = dadosDigitados.nextInt();

		int maiorValor = 0;
		int menorValor = 0;

		// Maior valor
		if (primeiroValor > segundoValor) {
			maiorValor = primeiroValor;
		} else if(segundoValor > primeiroValor){
			maiorValor = segundoValor;
		}

		// Menor valor
		if (primeiroValor < segundoValor) {
			menorValor = primeiroValor;
		} else if(segundoValor < primeiroValor){
			menorValor = segundoValor;
		}

		// iguais
		if (primeiroValor == segundoValor) {
			System.out.println("Os dois valores s�o iguais.");
		}
		
		//Mostra mensagem.
		System.out.println("Maior: " + maiorValor);
		
		System.out.println("Menor: " + menorValor);

	}
}
