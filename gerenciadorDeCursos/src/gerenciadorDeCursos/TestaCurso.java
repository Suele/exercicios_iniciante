package gerenciadorDeCursos;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso cursoAlura = new Curso("Paulo Silveira", "Dominando as Collections");

		cursoAlura.adiciona(new Aula("Introdução", 5));
		cursoAlura.adiciona(new Aula("Conhecendo mais as Coleções", 20));
		cursoAlura.adiciona(new Aula("Um pouco mais de ArrayList e LinkedList com Interface List", 19));
		
		List<Aula> aulas = cursoAlura.getAulas();
		System.out.println(aulas);
		
		System.out.println(cursoAlura.getAulas());
		
		System.out.println(aulas);

	}

}
