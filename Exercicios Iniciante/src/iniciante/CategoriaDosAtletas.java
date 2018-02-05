// Algoritmo que classifica os atletas por idade.
package iniciante;

import java.util.Scanner;

public class CategoriaDosAtletas {

	public static void main(String[] args) {
		
		Scanner lerDados = new Scanner(System.in);

		int idade = 0;
		
		System.out.print("Digite sua idade: ");
		idade = lerDados.nextInt();
		
		if (idade >= 5 && idade <= 10) {
			System.out.println("Infantil");
		}
		if (idade >= 11 && idade <= 15) {
			System.out.println("Juvenil");
		}
		if (idade >= 16 && idade <= 20) {
			System.out.println("Junior");
		}
		if(idade >= 21 && idade >= 25) {
			System.out.println("Profissional");
		}
	}

}
