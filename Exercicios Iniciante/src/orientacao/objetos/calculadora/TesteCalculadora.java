package orientacao.objetos.calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora("", 20, "-", 10);

		System.out.println(calculadora.soma());
		/*
		System.out.println("Subtra��o: " + calculadora.subtracao());
		System.out.println("Multiplica��o: " + calculadora.multiplicacao());
		System.out.println("Divis�o: " + calculadora.divisao());
		*/
	}

}
