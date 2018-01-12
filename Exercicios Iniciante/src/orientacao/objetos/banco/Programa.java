package orientacao.objetos.banco;

public class Programa {

	public static void main(String[] args) {

		Conta minhaConta = new Conta();

		minhaConta.numeroConta = 123;
		minhaConta.saldo = 1000.0;
		minhaConta.titular = "Maria de Jesus";

		System.out.println("Dados da Conta Bancaria");
		System.out.println("");

		System.out.print("Nome: " + minhaConta.titular);
		System.out.println("");

		System.out.print("Número da Conta: " + minhaConta.numeroConta);
		System.out.println("");

		System.out.print("Saldo: " + minhaConta.saldo);
		System.out.println("");

		minhaConta.saca(100.0);

		System.out.print("Novo Saldo: " + minhaConta.saldo);
		System.out.println("");

		minhaConta.deposita(190);
		System.out.println("Outro novo saldo: " + minhaConta.saldo);
		System.out.println("");
	}

}
