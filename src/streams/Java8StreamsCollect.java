package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Java8StreamsCollect {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //fornecedor - acumulação - combinação
        Set<String> collect = list.stream()
                .collect(
                        () -> new HashSet<>(),
                        (l, e) -> l.add(e.toString()),
                        (l1, l2) -> l1.addAll(l2));

        System.out.println(list);
        System.out.println(collect);

        //toList - Retorna todos os elementos do stream em um List
        List<Integer> collect1 = list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collect1);

        //toSet - Retorna todos os elementos do stream em um Set
        Set<Integer> collect2 = list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(collect2);


        //toCollection - Retorna todos os elementos do stream na Collection que deseja utilizar
        Deque<Integer> collect3 = list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toCollection(
                        () -> new ArrayDeque<Integer>()));

        System.out.println(collect3);

        //joining- Utilizado para unir Strings. Pode utilizar um demilitador para separar cada caracter. Internamente usa o StringBuilder
        String join = list.stream()
                .map(e -> e.toString())
                .collect(Collectors.joining(";"));

        System.out.println(join);

        //averaging - Retorna a média de todos os valores
        Double collect4 = list.stream()
                .collect(Collectors.averagingInt(n -> n.intValue()));// recebe uma função que conveta o elmento para o seu tipo (int)

        System.out.println(collect4);

        //summing - Retorna a soma de todos os valores
        Integer collect5 = list.stream()
                .collect(Collectors.summingInt(n -> n.intValue()));// recebe uma função que conveta o elmento para o seu tipo (int)

        System.out.println(collect5);


        //summarizing - Retorna uma Sumarização de todos os valores
        IntSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingInt(n -> n.intValue()));// recebe uma função que conveta o elmento para o seu tipo (int)

        System.out.println("IntSummaryStatistics: ");
        System.out.println(stats.getAverage());
        System.out.println(stats.getCount());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());

        System.out.println();

        //counting - Retorna a quantidade de elementos no stream
        Long collect6 = list.stream()
                .collect(Collectors.counting());

        System.out.println(collect6);

        //Max/Min - Retorna o maior e o menor valor dos elementos de um stream
        list.stream()
                .collect(Collectors.minBy(Comparator.naturalOrder()))
                .ifPresent(System.out::println);

        //groupingBy - Retorna um Map agrupando os elementos pelo resultado da função informada no argumento
        Map<Integer, List<Integer>> collect7 = list.stream()
                .collect(Collectors.groupingBy((n) -> n % 3));

        System.out.println(collect7);

        //partitioningBy - Retorna um Map agrupando os elementos entre true e false. Com isso a função no parâmetro deve ter retorno booleano
        Map<Boolean, List<Integer>> collect8 = list.stream()
                .collect(Collectors.partitioningBy((n) -> n % 3 == 0));

        System.out.println(collect8);

        //toMap - Retorna um Map de maneira mais customizável
        Map<Integer, Double> collect9 = list.stream()
                .collect(Collectors.toMap(
                        n -> n, // Informa qual será a chave do mapa
                        n -> Math.pow(n.doubleValue(), 5)// Informa qual será o valor dentro da chave
                ));

        System.out.println(collect9);

    }
}

