package orientacao.objetos.banco;

public class Conta {

	// atributos
	int numeroConta;
	double saldo;
	String titular;

	void saca(double quantidade) {
		if (quantidade <= this.saldo) {
			this.saldo = this.saldo - quantidade;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	void deposita(double quantidade) {
		if (quantidade > 0 && quantidade != 0) {
			this.saldo += quantidade;
		} else {
			System.out.println(" A quantidade a ser depositado não pode ser negativa nem zero.");
		}
	}

}
