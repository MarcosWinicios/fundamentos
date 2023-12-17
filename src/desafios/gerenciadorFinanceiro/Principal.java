package desafios.gerenciadorFinanceiro;

import desafios.gerenciadorFinanceiro.exception.OperacaoContaException;
import desafios.gerenciadorFinanceiro.modelo.Cliente;
import desafios.gerenciadorFinanceiro.modelo.Conta;
import desafios.gerenciadorFinanceiro.modelo.ContaPagar;
import desafios.gerenciadorFinanceiro.modelo.ContaReceber;
import desafios.gerenciadorFinanceiro.modelo.Fornecedor;
import desafios.gerenciadorFinanceiro.modelo.RelatorioContas;


public class Principal {

	public static void main(String[] args) {
		// instanciando fornecedores
		Fornecedor imobiliaria = new Fornecedor("Casa & Cia Negócios Imobiliários");
		Fornecedor mercado = new Fornecedor("Mercado do João");
		
		// instanciando clientes
		Cliente atacadista = new Cliente("Triângulo Quadrado Atacadista");
		Cliente telecom = new Cliente("FoneNet Telecomunicações");
	

		// instanciando contas a pagar
		ContaPagar contaPagar1 = new ContaPagar(imobiliaria, "Aluguel da matriz", 1230d, "10/05/2012");
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");

		// instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber(atacadista, "Desenvolvimento de projeto de logística em Java", 89500d, "23/05/2012");
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 53200d, "13/05/2012");
		
		
		// pagamento e cancelamento de contas a pagar
		pagarConta(contaPagar1);
		pagarConta(contaPagar1);
		cancelarConta(contaPagar1);
		cancelarConta(contaPagar2);
		cancelarConta(contaPagar2);

		// recebimento e cancelamento de contas a receber
		
		receberConta(contaReceber1);
		receberConta(contaReceber2);
		cancelarConta(contaReceber1);
		cancelarConta(contaReceber2);
		
		// exibe listagem de todas as contas com detalhamento
		Conta[] contas = new Conta[]{contaPagar1, contaPagar2, contaReceber1, contaReceber2};
		RelatorioContas relatorio = new RelatorioContas();
		relatorio.exibirListagem(contas);
	}
	
	public static void pagarConta(ContaPagar conta) {
		System.out.println("___ PAGAMENTO ____");
		try {
			conta.pagar();
		} catch (OperacaoContaException e) {
			System.err.println(e.getMessage());
		}finally {
			quebrarLinha(" ");
		}
	}
	
	public static void cancelarConta(Conta conta) {
		System.out.println("___ CANCELAMENTO ____");
		try {
			if(conta instanceof ContaReceber) {
				ContaReceber contaReceber = (ContaReceber) conta;
				contaReceber.cancelar();
			}else if(conta instanceof ContaPagar) {
				ContaPagar contaPagar = (ContaPagar) conta;
				contaPagar.cancelar();
			}
			
		} catch (OperacaoContaException e) {
			System.err.println(e.getMessage());
		}finally {
//			quebrarLinha(" ");
		}
	}
	public static void receberConta(ContaReceber conta) {
		System.out.println("___ RECEBIMENTO ____");
		try {
			conta.receber();
		} catch (OperacaoContaException e) {
			System.err.println(e.getMessage());
		}finally {
			quebrarLinha(" ");
		}
	}
	
	private static void quebrarLinha() {
		for (int i = 0; i < 10; i++) {
			System.out.print(" ");
		}
		System.out.print("\n");
	}

	private static void quebrarLinha(String text) {
		for (int i = 0; i < 10; i++) {
			System.out.print(text);
		}
		System.out.print("\n");
	}
	
}
