package date.aluguelcarro.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import date.aluguelcarro.model.Aluguel;
import date.aluguelcarro.model.Carro;
import date.aluguelcarro.model.Cliente;

public class DevolucaoCarro {

	public static void main(String[] args) {
		Aluguel aluguel = recuperarAluguel();
		
		//Para cada hora de atraso, ele pafa 10% do valor do carro em multa
		LocalDateTime dataEHoraRealDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.now());
		aluguel.setDateEHoraRealDaDevolucao(dataEHoraRealDaDevolucao);
		aluguel.imprimeFatura();
		
	}

	private static Aluguel recuperarAluguel() {
		Cliente cliente = new Cliente("João Silva", LocalDate.of(2000, Month.AUGUST, 13));
		Carro carro = new Carro("Gol", 90.0, Year.of(2012));

		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(),
				LocalTime.of(LocalTime.now().getHour(), 0));

		LocalDateTime dateEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);

		Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dateEHoraPrevistaParaDevolucao);
		return aluguel;
	}
}
