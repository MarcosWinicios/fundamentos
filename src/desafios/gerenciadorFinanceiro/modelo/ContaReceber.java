package desafios.gerenciadorFinanceiro.modelo;

import desafios.gerenciadorFinanceiro.exception.OperacaoContaException;

public class ContaReceber extends Conta {

	private Cliente cliente;

	public ContaReceber() {
		super();
	}

	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		super(descricao, valor, dataVencimento);
		this.cliente = cliente;
	}

	public void cancelar() throws OperacaoContaException {
		if (this.podeSerCancelada()) {
			super.cancelar();
		} else {
			throw new OperacaoContaException("ESSA CONTA NÃO PODE SER CANCELADA: " + this.descricao);
		}
//		this.quebrarLinha("-");
	}
	
	//Só deve ser possível cancelar uma conta caso o valor seja menor que 50 mil
	private boolean podeSerCancelada() {
		return !(this.getValor() <= 50000d);
	}

	public void receber() throws OperacaoContaException {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("Não pode receber uma conta que já foi recebida: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			throw new OperacaoContaException("Não pode receber uma conta que está cancelada: " + this.getDescricao() + ".");
		} else {
			System.out.println(
					"Recebendo conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do cliente " + this.getCliente().getNome() + ".");

			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
		
//		super.quebrarLinha();
		
	}
	
	@Override
	public void exibirDetalhes() {
		
		String resultado = "";
		resultado += "______________CONTA A RECEBER ______________\n\n";
		resultado += "Conta: " + this.getDescricao() + "\n";
		resultado += "Cliente: " + this.getCliente().getNome() + "\n";
		resultado += "Vencimento: " + this.getDataVencimento() + "\n";
		resultado += "Valor: " + this.getValor() + "\n";
		resultado += "Situação: " + this.getSituacaoConta() + "\n";
		
		System.out.println(resultado);
	}
			
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
