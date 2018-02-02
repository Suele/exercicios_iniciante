// Algoritmo que calcula a tabuada do valor digitado.

package iniciante;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner lerDados = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = lerDados.nextInt();

		System.out.println("");

		for (int i = 0; i <= 10; i++) {
			int resultado = (numero * i);
			System.out.println(numero + " * " + i + " = " + resultado);
		}

	}

}
