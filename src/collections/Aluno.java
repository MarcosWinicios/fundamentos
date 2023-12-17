package collections;

import java.util.Objects;

public class Aluno {
	private String nome;
	private int idade;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//permite buscas mais rápidas ao utilizar collections
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	//determina qual atributo deve ser usado para comparações
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}
	
	

}
