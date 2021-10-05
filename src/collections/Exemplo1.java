package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo1 {

	public static void main(String[] args) {
		List<String> nomes =  new ArrayList<>();
		
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("João");
		
//		nomes.remove(1); // Removendo a partir do index
//		nomes.remove("João"); // Removendo a partir do conteúdo		
//		System.out.println(nomes);
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println("Nome: " + nomes.get(i));
		}
		
		System.out.println("----");
		
		for(String nome : nomes) {
			System.out.println("Nome: "+ nome);
		}
		
		System.out.println("----");
		//For each passando classe anônima do tipo Consumer
		nomes.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);	
			}				
		});
		
		System.out.println("----");
		//For each utilizando expressão lâmbida 
		nomes.forEach(nome -> {
			System.out.println(nome);
		});
		System.out.println("----");

		//Expressão lâmbida sem abrir bloco pois implementa apenas uma linha de código
		nomes.forEach(nome -> System.out.println(nome));
		
		System.out.println("----");
		
		// Method Reference
		nomes.forEach(System.out::println);
	}

}
