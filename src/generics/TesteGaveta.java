package generics;

public class TesteGaveta {
	public static void main(String[] args) {
		Gaveta<String> gaveta = new Gaveta<>();
		gaveta.colocar("Livro de Java");
		
		System.out.println(gaveta.retirarPrimeiro());
		
		Gaveta<Integer> gavetaNumeros = new Gaveta<>();
		
		gavetaNumeros.colocar(1);
		
		System.out.println(gavetaNumeros.retirarPrimeiro() +2);
		
	}
}
