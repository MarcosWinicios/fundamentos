package exceptions;

public class ContaCorrente {
	private double saldo;

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double deposito) {
		if (deposito <= 0) {
			throw new IllegalArgumentException("O Valor não pode ser menor que Zero");
		}
		this.saldo += saldo;
	}

	public void sacar(double quantidade) throws SaldoInsuficienteException {
		double saldoTemporario = saldo - quantidade;
		if(saldoTemporario < 0) {
			throw new SaldoInsuficienteException("Você não possui saldo suficiente");
		}
		
		this.saldo -= quantidade;
	}

	public double getSaldo() {
		return saldo;
	}
}
