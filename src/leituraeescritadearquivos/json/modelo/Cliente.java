package leituraeescritadearquivos.json.modelo;

import java.util.List;

public class Cliente {
	private String nome;
	private int idade;
	private Endereco endereco;
	private List<Telefone> telefones;
	
	public Cliente() {}

	public Cliente(String nome, int idade, Endereco endereco, List<Telefone> telefones) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Nome: ").append(this.nome).append("\n").append("Idade: ").append(this.idade);
		return result.toString();
	}
}
