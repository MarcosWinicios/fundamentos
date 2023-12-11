package poo.interfaces.pagamento.operadoras;

import poo.interfaces.pagamento.Autorizavel;
import poo.interfaces.pagamento.Cartao;
import poo.interfaces.pagamento.Operadora;

public class Cielo implements Operadora {
	
	// Só vai autorizar se o número do cartão começar com 123 e se o valor total for menor que 100
	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("123")
				&& autorizavel.getValorTotal() < 100;
	}

}
