package desafios.gerenciadorFinanceiro.modelo;

public class RelatorioContas {
	
	public void exibirListagem(Conta[] contas) {
		System.out.println("############# RELATÓRIO #############");
		for(Conta conta : contas) {
			conta.exibirDetalhes();
		}
		System.out.println("##########################");
	}
}
