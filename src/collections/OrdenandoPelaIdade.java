package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPelaIdade {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João", 22);
		Aluno a2 = new Aluno("Adriana", 23);
		Aluno a3 = new Aluno("Bruno", 21);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3);
		
		IdadeComparator idadeComparator = new IdadeComparator();
		
		Collections.sort(alunos, idadeComparator);
		
		//Para Java 8
//		alunos.sort(idadeComparator);
//		alunos.forEach(System.out::println);
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
