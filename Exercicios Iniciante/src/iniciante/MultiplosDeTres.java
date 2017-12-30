//Mostra todos os números multiplos de 3 de 1 a 100.

package iniciante;

public class MultiplosDeTres {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println("Multiplos de 3 " + i);
			}
		}

	}
}
