package gerenciadorDeCursos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private int tempoTotal;
	private String instrutor;
	private String nome;
	private List<Aula> aulas = new LinkedList<Aula>();

	public Curso(String instrutor, String nome) {
		this.instrutor = instrutor;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {

		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	@Override
	public String toString() {
		return "[" + "Nome: " + getNome() + ", " + "Instrutor: " + getInstrutor() + ", " 
				+ "Tempo Total:" + getTempoTotal() + "]";
	}

}
