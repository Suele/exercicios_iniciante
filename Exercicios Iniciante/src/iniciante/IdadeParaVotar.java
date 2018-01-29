// Algoritmo que verifica se a pessoa tem idade para votar.

package iniciante;

public class IdadeParaVotar {

	public static void main(String[] args) {

		int anoAtual = 2018;
		int anoNasc = 1920;
		int idade = (anoAtual - anoNasc);

		System.out.println("Sua idade: " + idade);

		if (idade < 16) {
			System.out.println("Você ainda não tem idade para votar.");
		}
		if ((idade >= 16 && idade <= 17) || idade > 70) {
			System.out.println("Seu voto é facultativo.");
		}
		if (idade >= 18 && idade <= 70) {
			System.out.println("Seu voto é obrigatorio.");
		}

	}

}
