package lambda;

import java.util.ArrayList;
import java.util.HashMap;

public class Java8Collections {
    public static void main(String[] args) {
        // Métodos uteis das collections para utilizar com lambda
        //List
        System.out.println("\n____LIST____\n");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //forEach
        System.out.println("\n----forEach\n");
        list.forEach(System.out::println);

        //removeIf - Recebe um Predicate(função que recebe um argumento e retorna boolean). Se o predicate passar o item é removido
        System.out.println("\n----removeIf\n");
        list.removeIf(n -> n % 2 == 0);
        list.forEach(System.out::println);

        //replaceAll - Recebe uma função UnaryOperation(função que recebe um argumento e retorna outro argumento do mesmo tipo)
        System.out.println("\n----replaceAll\n");
        list.replaceAll(n -> n * 2);
        list.forEach(System.out::println);

        //Map
        System.out.println("\n____Map____\n");

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Se");
        map.put(1, "inscreva");
        map.put(2, "no");
        map.put(3, "canal");

        //forEach - Recebe uma função BiConsumer(função com dois argumentos que não tem retorno)
        System.out.println("\n----forEach\n");
        map.forEach((k, v) -> System.out.println(k + v));

        //compute - Recebe dois argumentos. 1 - Uma chave do Mapa 2 - Uma função BiFunction que recebe a chave e o valor da chave do primeiro argumento.
        // Esta função irá modificar este valor e retorná-lo
        System.out.println("\n----compute\n");
        map.compute(1, (k, v) -> v + " agora");
        map.forEach((k, v) -> System.out.println(k + v));

        /**
         * merge - Recebe 3 parâmetros
         * 1 - Uma chave do mapa
         * 2 - Um valor
         * 3 - Uma função BiFunction (recebe dois parãmetros e retorna um valor)
         *  3.a - O valor da chave passada no parâmetro 1
         *  3.b - O valor do parâmetro 2
         *
         *  O merge irá substiuir o valor da chave passda no parâmetro 1 pelo retorno da função do parâmetro 3.
         *
         *  Se a chave do parâmetro 1 não existir no mapa, a chave apenas será inserida e receberá o valor do parâmetro 2
         *
         */
        System.out.println("\n----merge\n");
        map.merge(4, "!", (v1, v2) -> v1 + v2);
        map.forEach((k, v) -> System.out.println(k + v));

        /**
         * replaceAll - Recebe uma BiFunction sendo que os argumentos são sempre a chave e o valor de cada item.
         * Todos os valores serão substituídos pelo retorno da função
         */
        System.out.println("\n----replaceAll\n");
        map.replaceAll((k, v) -> v + "!");
        map.forEach((k, v) -> System.out.println(k + v));
    }
}
