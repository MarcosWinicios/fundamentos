package desafios.gerenciadorFinanceiro.modelo;

public class ContaReceber extends Conta {

	private Cliente cliente;

	public ContaReceber() {
		super();
	}

	//new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");
	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
		super(descricao, valor, dataVencimento);
		this.cliente = cliente;
	}

	public void cancelar() {
		if (this.podeSerCancelada()) {
			super.cancelar();
		} else {
			System.err.println("ESSA CONTA NÃO PODE SER CANCELADA!");
		}
		this.quebrarLinha("-");
	}
	
	//Só deve ser possível cancelar uma conta caso o valor seja menor que 50 mil
	private boolean podeSerCancelada() {
		return !(this.getValor() <= 50000d);
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void receber() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.err.println("Não pode receber uma conta que já foi recebida: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.err.println("Não pode receber uma conta que está cancelada: " + this.getDescricao() + ".");
		} else {
			System.out.println(
					"Recebendo conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do cliente " + this.getCliente().getNome() + ".");

			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
		
		super.quebrarLinha();
		
	}
}
