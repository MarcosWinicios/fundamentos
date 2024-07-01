package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8ParallelsStreams {


    /**
     * parallel vs parallelStream
     * parallel -> Transforma um Stream já existente em um Stream paralelo
     * parallelStream -> Já inicia um Stream paralelo a partir de uma lista
     * <p>
     * Quando utilizar? Apenas para processar Streams que contenham milhares de itens
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        /**
         *  forEach x forEachOrdered
         *  forEach -> Itera em ordem aleatória
         *  forEachOrdered -> Itera sempre na mesma ordem
         */
        System.out.println("\n----forEach x forEachOrdered\n");
        System.out.println("----forEach\n");
        list.parallelStream().forEach(System.out::println);

        System.out.println("----forEachOrdered\n");
        list.parallelStream().forEachOrdered(System.out::println);


        /**
         * findAny - retorna um Optional com um único elemento do stream e finaliza o stream
         *  parallelStream -> Retorna o elemento da thread que terminar primeiro
         *  stream -> Retorna sempre o primeiro pois o stream está sendo tratado por uma única thread
         *
         */
        System.out.println("\n----findAny\n");
        System.out.println("--parallelStream");
        list.parallelStream().findAny().ifPresent(System.out::println);

        System.out.println("--stream");
        list.stream().findAny().ifPresent(System.out::println);

        /**
         * unordered: Utilizar quando se utiliza operações em stream paralelos em que as threads devem trocar informações como
         * skip - As threds precisam descobrir com qual thread está o primeiro item para pulá-lo
         * limit - As threads precisam descobrir quais itens estão inclusos no limit
         * distinct - As threads precisam comparar todos os items do stream para saber quais são iguais
         *
         * O unordered vai tirar a obrigatoriedade das operações citadas obedecerem a ordem dos elementos do stream.
         * Sendo assim cada uma vai processar os items da thread que processar primeiro
         */
        System.out.println("\n----unordered\n");
        list.parallelStream().unordered().skip(1).limit(2).forEach(System.out::println);


        /**
         * reduce - Utilizar o reduce em streams paralelos apenas com operações associativas. Pois a divisão de threds não garante a ordem das execuões
         * (1 + 2) + (3 + 4) = 10 - é associativa
         * (1 - 2) - (3 - 4) != 8 - não é associativa
         */

        System.out.println("\n----reduce\n");

        list.parallelStream().reduce((n1, n2) -> n1 + n2)//associativa
//                .reduce((n1, n2) -> n1 - n2) // não associativa
                .ifPresent(System.out::println);

        /**
         * collect: Ao utilizar Stream paralelo para gerar um mapa, cada thread gera um mapa e ao fim realiza um merge de todos para retornar apenas um.
         * isso torna muito mais custoso. Deve-se utilizar a versão dos seguintes coletores que suportam concorrências de threds
         * toMap -> toConcorrentMap
         * groupingBy -> groupingByConcurrent
         *
         * Os elementos são inseridos no novo Mapa em ordem aleatória
         */
        System.out.println("\n----collect: toMap and groupingBy\n");
        //toMap -> toConcurrentMap
        System.out.println("--toMap -> toConcurrentMap");
        Map<Integer, Boolean> collect =
                list.parallelStream()
                        .collect(
//                                Collectors.toMap(n -> n, n -> n % 2 == 0) //Um Mapa para cada Thread
                                Collectors.toConcurrentMap(n -> n, n -> n % 2 == 0) //Um Mapa para todas as Threads
                        );

        System.out.println(collect);

        //groupingBy -> toConcurrentMap
        System.out.println("\n--groupingBy -> groupingByConcurrent");


        Map<Boolean, List<Integer>> collect2 = list.parallelStream()
                .collect(
//                        Collectors.groupingBy(n -> n % 2 == 0) //Um Mapa para cada Thread
                                Collectors.groupingByConcurrent( n -> n % 2 == 0) //Um Mapa para todas as Threads
                );

        System.out.println(collect2);
    }
}
