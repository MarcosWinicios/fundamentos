package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Java8BuiltinFunctionalInterfaces {

    public static void main(String[] args) {
        /**
         * Supplier -> Interface funcional que não recebe nenhum parâmetro mas vai entregar algum valor
         * Ex.: generate
         *
         * Consumer -> Interface funcional que recebe um valor mas não retorna nada
         * Ex.: forEach
         *
         * BiConsumer -> Interface funcional que não retorna nada, mas recebe DOIS valores
         * Ex.:
         *
         * Predicate -> Uma função que recebe UM ÚNICO valor e retorna um booleano
         * Ex.: filter
         *
         * BiPredicate -> Uma função que recebe DOIS valor e retorna um booleano
         *
         * Function -> Uma função que recebe UM ÚNICO valor/tipo e retorna um OUTRO valor/tipo
         * Ex.: map
         *
         * BiFunction -> Uma função que recebe DOIS VALORES e retorna um OUTRO valor
         *
         * UnaryOperation -> Uma função que recebe UM ÚNICO valor e retorna O MESMO valor/tipo. Extende a interface Function
         *
         *
         * BinaryOperation -> Uma função que recebe DOIS VALORES DO MESMO TIPO e retorna um MESMO valor/tipo. Extende a Interface BiFunction
         * Ex.: reduce
         */


        Stream
                .generate(() -> new Random().nextInt()) // Uso do supplier
                .limit(5)
                .forEach((e) -> System.out.println(e)); // Uso do Consumer

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
                .filter( e -> e % 2 == 0) //Uso do Predicate
                .map(e -> e.doubleValue()) // Uso do Function
                .reduce((e1, e2) -> e1 + e2)//Uso do BinaryOperation
                .ifPresent(System.out::println);

    }
}
