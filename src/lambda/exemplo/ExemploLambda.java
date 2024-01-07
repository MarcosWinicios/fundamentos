package lambda.exemplo;

import java.util.List;

import lambda.dao.FaturaDAO;
import lambda.modelo.Fatura;
import lambda.util.EnviadorEmail;

public class ExemploLambda {

	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

		EnviadorEmail enviadorEmail = new EnviadorEmail();

//		for(Fatura f: faturasVencidas) {
//			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
//		}

		faturasVencidas.forEach(f -> {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
			f.setEmailEnviado(true);
		});

	}

}
