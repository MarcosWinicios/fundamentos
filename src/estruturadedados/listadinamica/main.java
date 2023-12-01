package estruturadedados.listadinamica;

public class main {
	public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno = new Aluno();
		aluno.nome = "João";
		lista.adicionar(aluno);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		lista.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Alexandre";
		lista.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Normandes";
		lista.adicionar(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.nome = "Thiago";
		lista.adicionar(aluno5);
		
		for( int i = 0; i < lista.tamanho(); i++) {
			Aluno a = lista.obter(i);
			
			System.out.println("Aluno: " +  a.nome);
		}
		
	}
}
