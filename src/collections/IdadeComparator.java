package collections;

import java.util.Comparator;

public class IdadeComparator implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a1, Aluno a2) {
		if(a1.getIdade() < a2.getIdade()) {
			return -1;
		}else if(a1.getIdade() > a2.getIdade()) {
			return 1;
		}
		return 0;
	}

	
}
