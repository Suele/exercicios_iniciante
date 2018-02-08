package orientacao.objetos.calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora(10, 10);

		System.out.println("Soma: " + calculadora.soma());
		System.out.println("Subtração: " + calculadora.subtracao());
		System.out.println("Multiplicação: " + calculadora.multiplicacao());
		System.out.println("Divisão: " + calculadora.divisao());

	}

}
