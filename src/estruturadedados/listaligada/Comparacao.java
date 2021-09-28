package estruturadedados.listaligada;

import java.util.ArrayList;

public class Comparacao {

	public static void main(String[] args) {
		ListaLigada<Integer> lista =  new ListaLigada<Integer>();
		
		ArrayList<Integer> vetor =  new ArrayList<Integer>();
		
		//Adicionar elementos
		
		int limite = 10000;
		long tempoInicial =  System.currentTimeMillis();
		long tempoFinal = System.currentTimeMillis();
		
		for(int i=0; i< limite; i++) {
			vetor.add(i);
		}
		
		tempoFinal =  System.currentTimeMillis();
		
		
		System.out.println("Adicionou " + limite + " elementos no vetor");
		System.out.print(tempoFinal - tempoInicial);
		
		tempoInicial =  System.currentTimeMillis();

		for(int i=0; i< limite; i++) {
			lista.adicionar(i);
		}
		tempoFinal =  System.currentTimeMillis();
		System.out.println("\n\nAdicionou " + limite + " elementos na lista");
		System.out.print(tempoFinal - tempoInicial);
		
		
		
		//Ler valores
		tempoInicial =  System.currentTimeMillis();
		for(int i = 0; i < vetor.size(); i++) {
			vetor.get(i);
		}
		
		tempoFinal =  System.currentTimeMillis();
		System.out.println("\n\nTempo de leitura do vetor: ");
		System.out.print(tempoFinal - tempoInicial);
		
		
		tempoInicial =  System.currentTimeMillis();
		for(int i = 0; i < lista.getTamanho(); i++) {
			lista.get(i);
		}
		
		tempoFinal =  System.currentTimeMillis();
		System.out.println("\n\nTempo de leitura da Liasta Ligada: ");
		System.out.print(tempoFinal - tempoInicial);
		
		
	}

}
