package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Streams {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 8, 9, 1, 4, 7, 6, 6, 9, 9);

        //strem =  fluxo de dados

        System.out.println("Operações intermediárias: \n");
        // Filtrando dados
        list.stream()
                .skip(2) //ignorar elementos
                .limit(3) //limita elementos a serem processados
                .distinct() // evitar processar elementos repetidos utilizando o equal e hashcode para comparação
                .filter(e -> e % 2 == 0) // Realizar filtros personalizados
                .map( e -> e * 2) // Transformar dados sem modificar a lista original
                .forEach(e -> System.out.print(e + " "));

        System.out.println( "\n" + list);

        System.out.println("\nOperações finais: \n");

        String collect = list.stream()
//                .filter(e -> e % 2 == 0)
//                .map(e -> e * 3)
                .map(e -> String.valueOf(e))
//                .count(); // retorna quantidade de elementos
//                .min(Comparator.naturalOrder()); // Min e Max - Retorna o maior ou menor valor da lista. É preciso passar um comparador
//                .collect(Collectors.toList()); //Coleta todos os elementos e devolve em uma nova lista
//                .collect(Collectors.groupingBy(e -> e % 2 == 0)); // Gera um mapa agrupando os elemtnos pelo filtro personalizado (par e impar)
//                .collect(Collectors.groupingBy(e -> e % 3));// Gera um mapa agrupando os elemtnos pelo filtro personalizado (resto da divisão por 3)
                .collect(Collectors.joining(";")); // Concatena todos os elementos em uma única String (Só trabalha com Strings)

        System.out.println(collect);

    }
}
