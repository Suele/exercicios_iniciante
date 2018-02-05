package iniciante;

public class ArrayComValoresInicializados {

	public static void main(String[] args) {

		int[] s = { 10, 20, 30, 40, 50 };

		System.out.println("Elementos do array");
		for (int i = 1; i < s.length; i++) {
			System.out.println(i + " - " + s[i]);
		}

		System.out.println("");

		System.out.println("Tamanho: " + s.length);

		System.out.println("");

		int soma = s[0] + s[1] + s[2] + s[3] + s[4];
		System.out.println("Soma: " + soma);

	}

}
