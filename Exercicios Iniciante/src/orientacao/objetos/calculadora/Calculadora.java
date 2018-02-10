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

	double soma() {

		double total = 0;

		if (sinalPrimeiroValor.equals(sinalSegundoValor)) {
			System.out.print(sinalPrimeiroValor);
			return total = (this.primeiroValor + this.segundoValor);
		} else if (sinalPrimeiroValor != sinalSegundoValor && primeiroValor > segundoValor) {
			System.out.println(sinalPrimeiroValor);
			return total = (this.primeiroValor + this.segundoValor);
		} else if (primeiroValor != segundoValor && segundoValor > primeiroValor) {
			System.out.println(sinalSegundoValor);
			return total = (this.primeiroValor + this.segundoValor);
		}

		return 0;
	}

	double subtracao() {
		double resultado = 0;
		if (this.primeiroValor > this.segundoValor) {
			resultado = (this.primeiroValor + this.segundoValor);
		} else {
			System.out.println("O primeiro valor digitado não pode ser menor do que o segundo valor.");
		}
		return resultado;

	}

	double divisao() {
		double quociente = 0;
		if (this.segundoValor > 0) {
			quociente = (this.primeiroValor / this.segundoValor);
		} else {
			System.out.println("");
		}
		return quociente;
	}

	double multiplicacao() {
		double produto = 0;
		if (this.primeiroValor > 0 && this.segundoValor > 0) {
			produto = (this.primeiroValor * this.segundoValor);
		}
		return produto;
	}

}
