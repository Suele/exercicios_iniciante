package gerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso cursoAlura = new Curso("Paulo Silveira", "Dominando as Collections");
		
		cursoAlura.adiciona(new Aula("Introdução", 5));
		cursoAlura.adiciona(new Aula("Conhecendo mais as Coleções", 20));
		cursoAlura.adiciona(new Aula("Um pouco mais de ArrayList e LinkedList com Interface List", 19));
		cursoAlura.adiciona(new Aula("Relacionamento entre Classes e Listas", 23));
		cursoAlura.adiciona(new Aula("Aprendendo mais sobre Set", 17));

		System.out.println("Com o método getAulas: " + cursoAlura.getAulas());

		List<Aula> aulasImutaveis = cursoAlura.getAulas();

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);

		aulas.add(new Aula("Teste", 1));
		System.out.println("Aulas: " + aulas);

		Collections.sort(aulas);
		System.out.println("Aulas: " + aulas);

		System.out.println("Curso: " + cursoAlura);
	}

}
