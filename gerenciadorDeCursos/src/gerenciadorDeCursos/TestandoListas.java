package gerenciadorDeCursos;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Modelando a classe aula";
		String aula2 = "Conhecendo mais sobre listas";
		String aula3 = "Trabalhando com Set";

		ArrayList<String> aulas = new ArrayList<String>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		System.out.println(aulas.size());

		System.out.println("Está vaziu? " + aulas.isEmpty());

		System.out.println("Contém o objeto: " + aulas.contains(aula1));
		
		System.out.println("Depois de ordernar:");
		Collections.sort(aulas);
		System.out.println(aulas);

	}

}
