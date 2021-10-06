package collections.streamApi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import collections.streamApi.model.Produto;
import collections.streamApi.model.Produto.Status;



public class ExemploFilterForEach {

	public static void main(String[] args) {
		List<Produto> produtos =  new ArrayList<>();
		
		produtos.add(new Produto("Água 2L", Status.ATIVO, new BigDecimal(9.9)));
		produtos.add(new Produto("Picanha 1kg", Status.ATIVO, new BigDecimal(109.5)));
		produtos.add(new Produto("Carvão", Status.INATIVO, new BigDecimal(34.2)));
		produtos.add(new Produto("Cerveja 600ml", Status.ATIVO, new BigDecimal(8.4)));
		produtos.add(new Produto("Cupim 2kg", Status.ATIVO, new BigDecimal(92)));
		
		
		System.out.println("Utilizando Enhaced For\n");
		for(Produto produto: produtos) {
			if(produto.getNome().startsWith("C")) {
				produto.inativar();
			}
		}
		
		System.out.println("---\n"); 
		System.out.println("Utilizando tipo Stream com Consumer e Predicate\n");
		
		Predicate<Produto> predicate = p -> p.getNome().startsWith("C");		
		Consumer<Produto> consumer = p -> p.inativar();
		
		//Stream é um tipo que ajuda a navegação em elementos de uma coleção
		Stream<Produto> produtosStream =  produtos.stream()
				.filter(predicate);
		produtosStream.forEach(Produto::inativar);  //produtosStream.forEach(p -> p.inativar());
		
		
		System.out.println("---\n"); 
		System.out.println("Utilizando tipo Stream somento com Consumer e expressão lâmbida\n");
		Stream<Produto> produtosStream2 =  produtos.stream()
				.filter(p -> p.getNome().startsWith("C"));
		
//		produtosStream.forEach(Produto::inativar);
		
		
		System.out.println("---\n");
		System.out.println("Utilizando apenas o método stream com expressão lâmbida\n");
		produtos.stream()
				.filter(p -> p.getNome().startsWith("C"))
				.forEach(Produto::inativar); 
	}

}
