package orientacao.objetos.calculadora;

public class Calculadora {

	public double primeiroValor;
	public double segundoValor;

	public Calculadora(double primeiroValor, double segundoValor) {
		this.primeiroValor = primeiroValor;
		this.segundoValor = segundoValor;
	}

	double soma() {
		double total = (this.primeiroValor + this.segundoValor);
		return total;
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
