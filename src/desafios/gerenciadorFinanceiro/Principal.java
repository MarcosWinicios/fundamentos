package desafios.gerenciadorFinanceiro;

import desafios.gerenciadorFinanceiro.modelo.Cliente;
import desafios.gerenciadorFinanceiro.modelo.ContaPagar;
import desafios.gerenciadorFinanceiro.modelo.ContaReceber;
import desafios.gerenciadorFinanceiro.modelo.Fornecedor;


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
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online", 23200d, "13/05/2012");

		// pagamento e cancelamento de contas a pagar
		contaPagar1.pagar();
		contaPagar2.cancelar();
		contaPagar2.cancelar();

		// recebimento e cancelamento de contas a receber
		contaReceber1.receber();
		contaReceber2.cancelar();	
	}
}
