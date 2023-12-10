package desafios.gerenciadorFinanceiro.modelo;

public class Conta {
	protected String descricao;
	protected Double valor;
	protected String dataVencimento;
	protected SituacaoConta situacaoConta;
	
	protected Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}
	protected Conta(String descricao, Double valor, String dataVencimento) {
		this.situacaoConta = SituacaoConta.PENDENTE;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void cancelar() {
		String resposta =  "";
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			resposta = "Não pode cancelar uma conta que já foi paga: ";
			resposta = resposta.toUpperCase();
			resposta += this.descricao + ".";
			System.err.println(resposta);
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			resposta = "Não pode cancelar uma conta que já foi cancelada: ";
			resposta = resposta.toUpperCase();
			resposta += this.descricao + ".";
			System.err.println(resposta);

		} else {
			resposta = "Cancelando conta " + this.getDescricao() + ".";
			System.out.println(resposta);
			
			// altera situação da conta para CANCELADA
			this.situacaoConta = SituacaoConta.CANCELADA;
		}
		
		this.quebrarLinha("-");
	}
	
	protected void quebrarLinha() {
		for (int i = 0; i < 10; i++) {
			System.err.print("*");
		}
		System.out.print("\n");
	}

	protected void quebrarLinha(String text) {
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
