package desafios.gerenciadorFinanceiro.modelo;

public class ContaPagar extends Conta {
	private Fornecedor fornecedor;
	
	public ContaPagar() {
		super();
	}
	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		super(descricao, valor, dataVencimento);
		this.fornecedor = fornecedor;
	}

	public void pagar() {
		if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
			System.err.println("Não pode pagar uma conta que já está paga: " + this.getDescricao() + ".");
		} else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
			System.err.println("Não pode pagar uma conta que está cancelada: " + this.getDescricao() + ".");
		} else {
			System.out.println(
					"Pagando conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do fornecedor " + this.getFornecedor().getNome() + ".");

			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
		
		super.quebrarLinha();
	}
	
	@Override
	public void exibirDetalhes() {

		String resultado = "";
		resultado += "______________CONTA A PAGAR ______________\n\n";
		resultado += "Conta: " + this.getDescricao() + "\n";
		resultado += "Fornecedor: " + this.getFornecedor().getNome() + "\n";
		resultado += "Vencimento: " + this.getDataVencimento() + "\n";
		resultado += "Valor: " + this.getValor() + "\n";
		resultado += "Situação: " + this.getSituacaoConta() + "\n";
		
		System.out.println(resultado);
		
	}

	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
}