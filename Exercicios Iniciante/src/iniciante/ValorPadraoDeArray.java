package iniciante;

public class ValorPadraoDeArray {

	public static void main(String[] args) {

		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + "-" + a[i]);
		}

		System.out.println(" ");

		char[] b = new char[5];
		for (int j = 0; j < b.length; j++) {
			System.out.println(j + "-" + b[j]);
		}

		System.out.println(" ");

		String[] c = new String[5];
		for (int n = 0; n < c.length; n++) {
			System.out.println(n + "-" + c[n]);
		}

		System.out.println(" ");
		boolean[] d = new boolean[5];
		for (int i = 0; i < d.length; i++) {
			System.out.println(i + "-" + d[i]);
		}

	}

}
