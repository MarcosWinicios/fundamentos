package leituraeescritadearquivos.serializacao.model;

import java.io.Serializable;

public class Pessoa implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	private String nome;
	private int idade;
	private String profissao;
	
	public Pessoa() {}
	
	
	
	public Pessoa(String nome, int idade, String profissao) {
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
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
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}



	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", profissao=" + profissao + "]";
	}
	
}	
