//Algoritmo que mostra o n�mero antecessor do valor digitado.

package iniciante;

import java.util.Scanner;

public class NumeroAntecessor {
	public static void main(String[] args) {

		Scanner lerDados = new Scanner(System.in);

		System.out.println("Siga os passos abaixo.");

		System.out.print("Digite um n�mero inteiro: ");
		int numero = lerDados.nextInt();

		numero = numero - 1;

		System.out.println(numero);
	}
}
