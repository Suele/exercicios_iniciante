package iniciante;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {

		Scanner lerDados = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");

		int numero = lerDados.nextInt();

		if (numero > 0) {
			while (numero >= 1) {
				System.out.println(numero);

				numero--;
			}
		}else {
			System.out.println("O valor digitado deve ser maior que zero.");
		}
	}

}
