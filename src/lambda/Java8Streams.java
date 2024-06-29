package lambda;

import java.util.Arrays;
import java.util.List;

public class Java8Streams {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

        System.out.println("Operações intermediárias: \n");
        //strem =  fluxo de dados
        // Filtrando dados
        list.stream()
                .skip(2) //ignorar elementos
                .limit(3) //limita elementos a serem processados
                .distinct() // evitar processar elementos repetidos utilizando o equal e hashcode para comparação
                .filter(e -> e % 2 == 0) // Realizar filtros personalizados
                .map( e -> e * 2) // Transformar dados sem modificar a lista original
                .forEach(e -> System.out.print(e + " "));

        System.out.println( "\n" + list);
    }
}
