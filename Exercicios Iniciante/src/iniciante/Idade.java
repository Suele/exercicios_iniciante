//Algoritmo calcula a idade atual de uma pessoa.

package iniciante;

public class Idade {
	public static void main(String[] args) {

		String nome = "Bernardo"; 
		int anoDeNasc = 2003;
		int anoAtual = 2018;

		int idadeAtual = anoAtual - anoDeNasc;

		System.out.println("Nome: " + nome + ", Idade: " + idadeAtual + " anos");

	}
}
