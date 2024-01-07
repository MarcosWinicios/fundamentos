package date.aluguelcarro.exemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import date.aluguelcarro.model.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("João Silva", LocalDate.of(2000, Month.AUGUST, 13));
		
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		if(idade >= 18) {
			System.out.println("OK, pode ser cadastrado. Sua idade é: " + idade);
		}else {
			System.err.printf("Sua idade é: %d. Então não pode ter carteira", idade);
		}
	}
}
