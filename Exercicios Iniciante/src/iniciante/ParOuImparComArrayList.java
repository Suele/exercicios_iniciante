// Algoritmo que verifica se os valores digitados são pares ou ímpares atribuindo seus 
// valores nos arrays correspondentes.

package iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParOuImparComArrayList {

	public static void main(String[] args) {

		Scanner lerDados = new Scanner(System.in);

		List<Integer> par = new ArrayList<>();

		List<Integer> impar = new ArrayList<>();

		int valor = 0;

		System.out.println("Digite 10 valores.");

		for (int i = 1; i <= 10; i++) {

			System.out.println(">>> " + i + "º ");
			valor = lerDados.nextInt();

			if (valor % 2 == 0) {
				par.add(valor);
			} else {
				impar.add(valor);
			}
		}

		System.out.println("\nPar: " + par + " ,número de elementos: " + par.size());
		System.out.println("Ímpar: " + impar + " ,número de elementos: " + impar.size());

	}

}
