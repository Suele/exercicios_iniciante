//Verifica se um número é par ou Ímpar.

package iniciante;

public class ParOuImpar {
	public static void main(String[] args) {

		int primeiroNumero = 2;
		int segundoNumero = 5;
		
		if (primeiroNumero % 2 == 0 ) {
			System.out.println("É par.");
		}else {
			System.out.println("É Ímpar.");
		}
		
		if (segundoNumero % 2 != 0) {
			System.out.println("É Ímpar.");
		}else {
			System.out.println("É Par.");
		}

	}
}
