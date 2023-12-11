package poo.interfaces.teste;

import poo.interfaces.caixa.Checkout;
import poo.interfaces.caixa.Compra;
import poo.interfaces.impressao.Impressora;
import poo.interfaces.impressao.impressoras.ImpressoraEpson;
import poo.interfaces.impressao.impressoras.ImpressoraHP;
import poo.interfaces.pagamento.Autorizavel;
import poo.interfaces.pagamento.Cartao;
import poo.interfaces.pagamento.Operadora;
import poo.interfaces.pagamento.operadoras.Cielo;
import poo.interfaces.pagamento.operadoras.RedeCard;

public class TesteCheckout {

	public static void main(String[] args) {
		Operadora operadora = new RedeCard();
		Impressora impressora = new ImpressoraHP();
		
		Cartao cartao = new Cartao();
		cartao.setNomeTitular("João M Couves)");
		cartao.setNumeroCartao("456");
		
		Compra compra = new Compra();
		compra.setNomeCliente("João Mendonça COuves");
		compra.setProduto("Sabonete");
		compra.setValorTotal(500);
		
		Checkout checkout = new Checkout(operadora, impressora);
		checkout.fecharCompra(compra, cartao);
		
			
	}

}
