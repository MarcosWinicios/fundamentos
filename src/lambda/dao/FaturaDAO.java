package lambda.dao;

import java.util.ArrayList;
import java.util.List;

import lambda.modelo.Fatura;

public class FaturaDAO {
	
	
	public List<Fatura> buscarFaturasVencidas() {
		//Buscaria no banco de dados
		
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("joao@joao.com", 350.00));
		faturas.add(new Fatura("maria@maria.com", 150.00));
		faturas.add(new Fatura("jose@jose.com", 290.00));
		
		return faturas;
	}
}
