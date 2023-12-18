package desafios.gastosDePoliticos;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Classe que representa a organização de políticos de um Governo
 * @author Marcos Winicios
 */
public class Governo {
	// armazena uma lista de políticos por estado da federação
	
	/**
	 * Atributo da classe Governo que utiliza o a inteface Map para armazenar os partidos políticos do Governo
	 * 
	 */
	private Map<String, List<Politico>> partidosPoliticos;

	public Governo() {
		this.partidosPoliticos = new HashMap<String, List<Politico>>();
	}
	
	/**
	 * Método utilizado para adicionar um político a um partido.
	 * 
	 * @param partidoPolitico Objeto do tipo String que representa o nome do partido politico
	 * @param politico Objeto do tipo Politico que representa um politico
	 */
	public void adicionarPolitico(String partidoPolitico, Politico politico) {
		// recupera a lista de políticos para um partido
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);

		// se não existir uma lista de políticos para o partido informado,
		// devemos instanciar uma nova lista (pois é a primeira inclusão neste partido)
		if (politicos == null) {
			politicos = new ArrayList<Politico>();
		}

		// adiciona o político recebido como parâmetro à lista de políticos
		politicos.add(politico);

		// adiciona a lista de políticos ao mapa de partidos usando
		// como chave o nome do partido
		this.partidosPoliticos.put(partidoPolitico, politicos);
	}
	
	/**
	 * Método capaz de calcular os salários dos políticos de determinado partido.
	 * 
	 * @param partidoPolitico Objeto do tipo String que representa o nome de um partido político.
	 * @return Retorna um objeto do tipo BigDecimal que representa o cálculo total dos gastos com os salários de políticos do partido recebido nos parâmetros.
	 */
	public BigDecimal calcularGastosComSalario(String partidoPolitico) {
		// implementar busca de políticos para o partido informado
		// e cálculo dos salários
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		BigDecimal resultado = BigDecimal.ZERO;

		if (politicos != null) {
			for (Politico politico : politicos) {
				resultado = resultado.add(politico.getCargo().getSalario());
			}
		}

		return resultado;
	}

	/**
	 * Método capaz de calcular os gastos totais com políticos de um determinado cargo de um determinado partido
	 * 
	 * @param cargo Objeto do tipo Cargo que representa qual categoria de cargos de políticos será considerada para o cálculo
	 * @param partidoPolitico Objeto do tipo String que representa o partido político utilizado para o cálculo
	 * @return Retorna um Objeto do tipo BigDecimal que representa os gastos totais com salários de políticos.
	 */
	public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
		// implementar busca dos políticos para o partido e cargo informados
		// e cálculo dos salários
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		BigDecimal resultado = BigDecimal.ZERO;
		
		if (politicos != null) {
			for (Politico politico : politicos) {
				if (politico.getCargo().equals(cargo)) {
					resultado = resultado.add(politico.getCargo().getSalario());
				}
			}
		}

		return resultado;
	}

	public String obterPoliticosPorPartido(String partidoPolitico) {
		List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
		StringBuilder resultado = new StringBuilder();

		resultado.append(this.quebraDeLinha("_"));
		resultado.append("Políticos do partido: ".toUpperCase()).append(partidoPolitico);

		for (Politico politico : politicos) {
			resultado.append(this.quebraDeLinha());
			resultado.append(politico.obterDetalhesDeUmPolitico());
		}
		resultado.append(this.quebraDeLinha("_"));

		BigDecimal gastosTotal = this.calcularGastosComSalario(partidoPolitico);
		resultado.append("GASTO TOTAL: ").append(this.formataBigDecimal(gastosTotal));

		resultado.append(this.quebraDeLinha(" # "));
		return resultado.toString();
	}
	
	/**
	 * Método utilizado para gerar um relatório com detalhes de todos os políticos de cada partido do Governo
	 * @return retorna um Objeto do tipo String contendo as informações do relatório
	 */
	public String obterRelatorioGoverno() {
		StringBuilder resultado = new StringBuilder();
		resultado.append(this.quebraDeLinha(" = "));

		resultado.append("\n______RELATÓRIO DO GOVERNO______\n");

		for (Map.Entry<String, List<Politico>> entry : this.partidosPoliticos.entrySet()) {
			resultado = resultado.append(this.obterPoliticosPorPartido(entry.getKey()));
			resultado = resultado.append(this.quebraDeLinha("_"));
		}
		resultado = resultado.append(this.obterGastoTotalDoGoverno()).append("\n");
		resultado = resultado.append(this.quebraDeLinha(" = "));
		return resultado.toString();
	}

	public String obterGastoTotalDoGoverno() {
		StringBuilder resultado = new StringBuilder();
		resultado.append("GASTO TOTAL DO GOVERNO: ")
				.append(this.formataBigDecimal(this.calcularGastosTotaisDoGoverno()));
		return resultado.toString();
	}

	public BigDecimal calcularGastosTotaisDoGoverno() {
		BigDecimal gastoTotalGoverno = BigDecimal.ZERO;

		for (Map.Entry<String, List<Politico>> entry : this.partidosPoliticos.entrySet()) {
			BigDecimal gastoDoPartido = this.calcularGastosComSalario(entry.getKey());
			gastoTotalGoverno = gastoTotalGoverno.add(gastoDoPartido);
		}

		return gastoTotalGoverno;
	}

	public String quebraDeLinha() {
		StringBuilder linha = new StringBuilder();
		linha.append("\n");
		for (int i = 0; i < 6; i++) {
			linha.append(" - ");
		}
		linha.append("\n");
		return linha.toString();
	}

	public String quebraDeLinha(String simbolo) {
		StringBuilder linha = new StringBuilder();
		linha.append("\n");
		for (int i = 0; i < 6; i++) {
			linha.append(simbolo);
		}
		linha.append("\n");
		return linha.toString();
	}

	private static String formataBigDecimal(BigDecimal salario) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		return formatador.format(salario);

	}

}
