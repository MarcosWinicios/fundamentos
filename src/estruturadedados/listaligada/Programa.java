package estruturadedados.listaligada;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaLigada lista =  new ListaLigada();
		
	
		
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("CE");
		lista.adicionar("DF");
		
		
		System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo: " + lista.getUltimo().getValor());
		System.out.println(lista.get(0).getValor());
		System.out.println(lista.get(1).getValor());
		System.out.println(lista.get(2).getValor());
		System.out.println(lista.get(3).getValor());
		
		System.out.println("Buscando valor: ");
		
		Elemento elemento = lista.getConteudo("F");
		
		
		System.out.println(elemento.getValor());
		
		System.out.println("\nBuscando index: ");
		
		int index = lista.index(elemento.getValor());

		
		if(index >= 0) {
			System.out.println("Indice: " + index);
		}else {
			System.out.println("Valor não encontrado");
		}		
	}

}
