package desafios.gastosDePoliticos;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Politico {
	private String nome;
	private Cargo cargo;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String obterDetalhesDeUmPolitico() {

		StringBuilder result = new StringBuilder();
		
		try {
			result.append("Nome: ").append(this.getNome()).append("\n");
			result.append("Cargo: ").append(this.getCargo().getDescricao()).append("\n");
			result.append("Salário: ").append(formatarSalario(this.getCargo().getSalario())).append("\n");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result.toString();

	}

	private static String formatarSalario(BigDecimal salario) {
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		return formatador.format(salario);

	}

}
