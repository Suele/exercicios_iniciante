//Calcula o Balanço Trimestral do Primeiro Trimestre do ano.

package iniciante;

public class BalancoTrimestral {
	public static void main(String[] args) {

		double gastosDeJaneiro = 15000;
		double gastosDeFevereiro = 23000;
		double gastodDeMarco = 17000;

		double gastosTrimestral = (gastosDeJaneiro + gastosDeFevereiro + gastodDeMarco);

		System.out.println("Gasto Trimestral: " + gastosTrimestral);

		double mediaPrimeiroTrimestre = (gastosTrimestral / 3);

		System.out.println("Média do 1º Trimestre: " + mediaPrimeiroTrimestre);

	}
}
