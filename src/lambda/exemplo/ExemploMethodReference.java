package lambda.exemplo;

import java.util.List;

import lambda.dao.FaturaDAO;
import lambda.modelo.Fatura;

public class ExemploMethodReference {
	
	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
//		for (Fatura f : faturasVencidas) {
//			f.atualizarStatus();
//		}
		
//		faturasVencidas.forEach(f -> f.atualizarStatus());
		
		faturasVencidas.forEach(Fatura::atualizarStatus);
		
	}
}
