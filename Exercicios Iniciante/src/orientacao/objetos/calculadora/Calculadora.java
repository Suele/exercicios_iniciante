package orientacao.objetos.calculadora;

public class Calculadora {

	private double primeiroValor;
	private double segundoValor;
	private String sinalPrimeiroValor;
	private String sinalSegundoValor;

	public Calculadora(String sinalPrimeiroValor, double primeiroValor, String sinalSegundoValor, double segundoValor) {
		this.primeiroValor = primeiroValor;
		this.segundoValor = segundoValor;
		this.sinalPrimeiroValor = sinalPrimeiroValor;
		this.sinalSegundoValor = sinalSegundoValor;
	}

	public double soma() {

		double total = 0;

		if (sinalPrimeiroValor.equals("+") && sinalSegundoValor.equals("+")) {
			System.out.print("+");
			return total = (this.primeiroValor + this.segundoValor);
		} else if (sinalPrimeiroValor != sinalSegundoValor && primeiroValor > segundoValor) {
			System.out.print(sinalPrimeiroValor);
			return total = (this.primeiroValor + this.segundoValor);
		} else if (primeiroValor != segundoValor && segundoValor > primeiroValor) {
			System.out.print(sinalSegundoValor);
			return total = (this.primeiroValor + this.segundoValor);
		}

		return 0;
	}

	double subtracao() {

		double resultado = 0;

		if (sinalPrimeiroValor != sinalSegundoValor && primeiroValor > segundoValor) {
			System.out.print(sinalPrimeiroValor);
			return resultado = (primeiroValor - segundoValor);
		} else if (sinalPrimeiroValor != sinalSegundoValor && segundoValor > primeiroValor) {
			System.out.print(sinalSegundoValor);
			return resultado = (primeiroValor - segundoValor);
		} else if (sinalPrimeiroValor.equals(sinalSegundoValor)) {
			System.out.print(sinalPrimeiroValor);
			return resultado = (primeiroValor + segundoValor);
		}
		return 0;
	}

	double divisao() {

		double quociente = 0;

		if (sinalPrimeiroValor.equals(sinalSegundoValor)) {
			System.out.print(sinalPrimeiroValor);
			return quociente = (primeiroValor / segundoValor);
		} else {
			System.out.print("-");
			return quociente = (primeiroValor / segundoValor);
		}
	}

	double multiplicacao() {

		double produto = 0;

		if (sinalPrimeiroValor.equals(sinalSegundoValor)) {
			System.out.print(sinalPrimeiroValor);
			return produto = (primeiroValor * segundoValor);
		} else {
			System.out.print("-");
			return produto = (primeiroValor * segundoValor);
		}

	}

}
