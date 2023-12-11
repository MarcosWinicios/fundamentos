package poo.interfaces.pagamento.operadoras;

import poo.interfaces.pagamento.Autorizavel;
import poo.interfaces.pagamento.Cartao;
import poo.interfaces.pagamento.Operadora;

public class RedeCard implements Operadora{

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		return cartao.getNumeroCartao().startsWith("456")
				&& autorizavel.getValorTotal() < 200;
	}
	
}
