package poo.interfaces.caixa;

import poo.interfaces.impressao.Impressora;
import poo.interfaces.pagamento.Cartao;
import poo.interfaces.pagamento.Operadora;

public class Checkout {
	private Operadora operadora;
	private Impressora impressora;
	
	
	public Checkout(Operadora operadora, Impressora impressora) {
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fecharCompra(Compra compra, Cartao cartao) {
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if(autorizado) {
			this.impressora.imprimir(compra);
		}else {
			System.err.println("Pagamento Foi negado!");
		}
	}
	
	
	
	
	
	
	
	
	
	public Operadora getOperadora() {
		return operadora;
	}
	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}
	public Impressora getImpressora() {
		return impressora;
	}
	public void setImpressora(Impressora impressora) {
		this.impressora = impressora;
	}
	
}
