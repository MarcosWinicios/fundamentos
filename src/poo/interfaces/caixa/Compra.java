package poo.interfaces.caixa;

import poo.interfaces.impressao.Imprimivel;
import poo.interfaces.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel{

	private double valorTotal;
	private String produto;
	private String nomeCliente;
	
	
	@Override
	public String getCabecalhoPagina() {
		return this.getProduto() + " = " + this.getValorTotal();
	}

	@Override
	public String getCorpoDaPagina() {
		return this.nomeCliente;
	}
	
	
	
	@Override
	public double getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
}
