package iniciante;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero = 1;
		double nota = 0;
		double somaNotas = 0;
		double media = 0;

		while (numero <= 10) {
			System.out.print(numero + "º" + " nota: ");
			nota = ler.nextDouble();
			somaNotas += nota;
			numero++;
			System.out.println("");
		}

		media = somaNotas / 10;

		System.out.println("A média da turma é: " + media);
	}

}
