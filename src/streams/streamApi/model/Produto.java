package streams.streamApi.model;

import java.math.BigDecimal;

public class Produto {
	public enum Status {
		ATIVO, INATIVO
	}
	
	private String nome;
	private Status status;
	private BigDecimal preco;
	private Categoria categoria;
	
	public Produto(String nome, Status status, BigDecimal preco) {
		super();
		this.nome = nome;
		this.status = status;
		this.preco = preco;
	}

	public Produto(String nome, Status status, BigDecimal preco, Categoria categoria) {
		super();
		this.nome = nome;
		this.status = status;
		this.preco = preco;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public void inativar() {
		System.out.println("Inativado " + getNome());
		this.status = Status.INATIVO;
	}
}
