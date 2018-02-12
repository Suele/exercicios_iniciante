package gerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collections;

public class TesteListaAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisando as ArrayList", 21);
		Aula a2 = new Aula("Listas de Objetos", 19);
		Aula a3 = new Aula("Relacionamento de Listas e objetos", 15);
		Aula a4 = new Aula("Apresentação do Curso", 5);

		ArrayList<Aula> aulas = new ArrayList<>();

		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);

		System.out.print("Sem ordenar: ");
		System.out.println(aulas + "\n");

		Collections.sort(aulas);
		System.out.print("Depois de ordenar");
		System.out.println(aulas + "\n");

	}

}
