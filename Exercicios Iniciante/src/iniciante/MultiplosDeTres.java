//Mostra todos os números multiplos de 3 de 1 a 100.

package iniciante;

public class MultiplosDeTres {
	public static void main(String[] args) {

		double fatorial = 1;
		for (int i = 1; i <= 50; i++) {
			fatorial *= i;
			System.out.println("Fatorial de " + i + " = " + fatorial);
		}

	}
}
