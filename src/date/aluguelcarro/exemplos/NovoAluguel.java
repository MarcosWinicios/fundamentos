package date.aluguelcarro.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import date.aluguelcarro.model.Aluguel;
import date.aluguelcarro.model.Carro;
import date.aluguelcarro.model.Cliente;

public class NovoAluguel {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("João Silva", LocalDate.of(2000, Month.AUGUST, 13));
		Carro carro = new Carro("Gol", 90.0, Year.of(2012));
		
		
		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(), 
				LocalTime.of(LocalTime.now().getHour(), 0));
		
		
		LocalDateTime dateEHoraPrevistaParaDevolucao = 
				LocalDateTime.now().plusDays(3).plusHours(2);
		
		
		Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dateEHoraPrevistaParaDevolucao);
		
		imprimir(aluguel);
	}

	private static void imprimir(Aluguel aluguel) {
		System.out.println(">>>>>>>>>>>>>>> RECIBO >>>>>>>>>>>>>>>>");
		System.out.println("Carro: " + aluguel.getCarro().getModelo());
		System.out.println("Cliente: " + aluguel.getCliente().getNome());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		System.out.println("Data e hora da retirada: " +aluguel.getDataEHoraDaRetirada().format(formatter));
		System.out.println("Data e hora prevista para devolução: "+ aluguel.getDateEHoraPrevistaParaDevolucao().format(formatter));
	}
}
