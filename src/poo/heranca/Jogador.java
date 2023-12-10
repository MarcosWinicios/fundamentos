package poo.heranca;

public class Jogador extends Pessoa{
	protected boolean aindaJoga = false;
	
	public void dizerSeAindJoga() {
		System.out.println("Ainda joga?" + aindaJoga);
	}
}
