// Algoritmo que verifica se os valores digitados são pares ou ímpares atribuindo seus 
// valores nos arrays correspondentes.

package iniciante;

import java.util.Scanner;

public class ParOuImparComArray {

	public static void main(String[] args) {

		Scanner lerDados = new Scanner(System.in);

		int[] par = new int[10];
		int[] impar = new int[10];

		int numero = 0;

		for (int u = 1; u <= 5; u++) {
			System.out.println("Digite o " + u + "º ");
			numero = lerDados.nextInt();

			if (numero % 2 == 0) {
				for (int p = 0; p < par.length; p++) {
					if (par[p] == 0) {
						par[p] = numero;
					}
				}
			} else {
				for (int i = 0; i < impar.length; i++) {
					if (impar[i] == 0) {
						impar[i] = numero;
					}
				}
			}
		}

		System.out.println("\n Par");
		for (int i = 0; i < par.length; i++) {
			System.out.println(par[i]);
		}

		System.out.println("\n Ímpar");
		for (int i = 0; i < impar.length; i++) {
			System.out.println(impar[i]);
		}
	}

}
