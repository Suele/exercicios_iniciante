package orientacao.objetos.calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora(10, 10);

		System.out.println("Soma: " + calculadora.soma());
		System.out.println("Subtra��o: " + calculadora.subtracao());
		System.out.println("Multiplica��o: " + calculadora.multiplicacao());
		System.out.println("Divis�o: " + calculadora.divisao());

	}

}
