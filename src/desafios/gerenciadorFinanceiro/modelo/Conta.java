package desafios.gerenciadorFinanceiro.modelo;

public class Conta {
	protected String descricao;
	protected Double valor;
	protected String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	protected Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	
	public void cancelar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi paga: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.out.println("Não pode cancelar uma conta que já foi cancelada: " + this.getDescricao() + ".");
		} else {
			System.out.println("Cancelando conta " + this.getDescricao() + ".");

			// altera situação da conta para CANCELADA
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
		
		this.quebrarLinha();
	}
	
	protected static void quebrarLinha() {
		for (int i = 0; i < 10; i++) {
			System.err.print("*");
		}
		System.out.print("\n");
	}

	protected static void quebrarLinha(String text) {
		for (int i = 0; i < 10; i++) {
			System.err.print(text);
		}
		System.out.print("\n");
	}
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}
	
}
