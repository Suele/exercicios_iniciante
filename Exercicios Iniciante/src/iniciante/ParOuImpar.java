//Verifica se um n�mero � par ou �mpar.

package iniciante;

public class ParOuImpar {
	public static void main(String[] args) {

		int primeiroNumero = 2;
		int segundoNumero = 5;
		
		if (primeiroNumero % 2 == 0 ) {
			System.out.println("� par.");
		}else {
			System.out.println("� �mpar.");
		}
		
		if (segundoNumero % 2 != 0) {
			System.out.println("� �mpar.");
		}else {
			System.out.println("� Par.");
		}

	}
}
