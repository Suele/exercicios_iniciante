package orientacao.objetos.banco;

public class Funcionario {

	String nome;
	String cpf;
	String departamento;
	String rg;
	double salario;
	Data data;

	void salario(double salarioBruto, double planoSaude, double outrosDescontos) {
		this.salario = salarioBruto - planoSaude - outrosDescontos;
	}

	void recebeAumento(double valor) {
		this.salario += valor;
	}

	double calculaGanhoAnual() {
		return this.salario *= 12;
	}

	void ferias(int dias) {

	}

}
