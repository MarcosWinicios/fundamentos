package lambda.exemplo;

import java.util.List;
import java.util.stream.Stream;

import lambda.dao.FaturaDAO;
import lambda.modelo.Fatura;

public class Teste {

	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

//		for (Fatura f : faturasVencidas) {
//			if( f.getValor() > 250) {
//				System.out.println("Alerta:  Fatura acuma de R$250 -> " + f);
//			}
//		}
		
//		faturasVencidas.forEach(f -> System.out.println(f));

		faturasVencidas.stream()
			.filter(Fatura::estaEmRisco)
			.forEach(System.out::println);


	}
}
