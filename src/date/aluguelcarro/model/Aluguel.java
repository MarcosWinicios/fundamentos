package date.aluguelcarro.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {

	private Cliente cliente;
	private Carro carro;
	private LocalDateTime dataEHoraDaRetirada;
	private LocalDateTime dateEHoraPrevistaParaDevolucao;
	private LocalDateTime dateEHoraRealDaDevolucao;

	public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataEHoraDaRetirada,
			LocalDateTime dateEHoraPrevistaParaDevolucao) {
		this.cliente = cliente;
		this.carro = carro;
		this.dataEHoraDaRetirada = dataEHoraDaRetirada;
		this.dateEHoraPrevistaParaDevolucao = dateEHoraPrevistaParaDevolucao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public LocalDateTime getDataEHoraDaRetirada() {
		return dataEHoraDaRetirada;
	}

	public void setDataEHoraDaRetirada(LocalDateTime dataEHoraDaRetirada) {
		this.dataEHoraDaRetirada = dataEHoraDaRetirada;
	}

	public LocalDateTime getDateEHoraPrevistaParaDevolucao() {
		return dateEHoraPrevistaParaDevolucao;
	}

	public void setDateEHoraPrevistaParaDevolucao(LocalDateTime dateEHoraPrevistaParaDevolucao) {
		this.dateEHoraPrevistaParaDevolucao = dateEHoraPrevistaParaDevolucao;
	}

	public LocalDateTime getDateEHoraRealDaDevolucao() {
		return dateEHoraRealDaDevolucao;
	}

	public void setDateEHoraRealDaDevolucao(LocalDateTime dateEHoraRealDaDevolucao) {
		this.dateEHoraRealDaDevolucao = dateEHoraRealDaDevolucao;
	}

	public void imprimeFatura() {
		Duration duration = Duration.between(dateEHoraPrevistaParaDevolucao, dateEHoraRealDaDevolucao);
		System.out.println(">>>>>>>>>>>>> Fatura <<<<<<<<<<<<<<<");

		if (!duration.isNegative()) {
			double multa = duration.toHours() * carro.getValorDiaria() * 0.1;
			System.out.printf("Valor da multa R$ %.2f. Pois você atrasou %d horas. ", multa, duration.toHours());
		}else {
			System.out.println("Obrigado. Você foi pontual!");
		}
	}

}
