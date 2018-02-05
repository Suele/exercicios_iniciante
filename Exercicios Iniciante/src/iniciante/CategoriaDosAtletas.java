// Algoritmo que classifica os atletas por idade.
package iniciante;

import java.util.Scanner;

public class CategoriaDosAtletas {

	public static void main(String[] args) {

		Scanner lerDados = new Scanner(System.in);

		int idade = 0;
		String nome;

		System.out.print("Digite seu nome: ");
		nome = lerDados.nextLine();

		System.out.print("Digite sua idade: ");
		idade = lerDados.nextInt();

		if (idade < 5) {
			System.out.println("Idade incompativel com as categorias.");
		}

		if (idade >= 5 && idade <= 10) {
			System.out.println("Nome: " + nome + " Categoria Infantil");
		}
		if (idade >= 11 && idade <= 15) {
			System.out.println("Nome: " + nome + " Categoria Juvenil");
		}
		if (idade >= 16 && idade <= 20) {
			System.out.println("Nome: " + nome + " Categoria Junior");
		}
		if ((idade >= 21 && idade >= 25 && idade <= 42)) {
			System.out.println("Nome: " + nome + " Categoria Profissional");
		}
		if (idade > 42) {
			System.out.println("Aposentado");
		}
	}

}
