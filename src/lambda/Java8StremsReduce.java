package lambda;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.DoubleStream;

public class Java8StremsReduce {

    // Reduce transforma todos os elementos de um Stream em um único valor. A forma de fazer isso é determinada pela função lambda passada como parâmetro.
    // Deve ser utilizada uma função associativa
    public static void main(String[] args) {

        String s = "Inscreva-se no canal e compartilhe esse video";
        String[] split = s.split(" ");
        List<String> listStr =  Arrays.asList(split);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        // reduce - soma
        Optional<Integer> soma = list.stream()
                .reduce((n1, n2) -> n1 + n2); // Soma todos os elementos

        System.out.println(soma.get());

        // reduce - multiplicação
        Optional<Integer> multiplicacao = list.stream()
                .reduce((n1, n2) -> n1 * n2); // Multiplica todos os elementos

        System.out.println(multiplicacao.get());

        // reduce - concatenação
        Optional<String> concatenacao = listStr.stream()
                .reduce((s1, s2) -> s1.concat(s2)); // Concatena todos os elementos

        System.out.println(concatenacao.get());

        // reduce - Subtração - NÃO UTILIZAR, pois não é uma função associativa
        Optional<Integer> subtracao = list.stream()
                .reduce((n1, n2) -> n1 - n2); // Soma todos os elementos

        System.out.println(subtracao.get());


        //----------------
        System.out.println("----------");
        //O Valor de identidade pode ser utilizado quando deseja retornar um valor padrão se a lista tiver vazia.
        List<Integer> emptyList = Arrays.asList();
        // reduce - soma
        Integer soma2 = emptyList.stream()
                .reduce(0, (n1, n2) -> n1 + n2); // 0 é o valor de identidade para soma

        System.out.println(soma2);

        // reduce - multiplicação
      Integer multiplicacao2 = emptyList.stream()
                .reduce(1, (n1, n2) -> n1 * n2); // 1 é o valor de identidade para multiplicação

        System.out.println(multiplicacao2);

        // reduce - concatenação
        String concatenacao2 = listStr.stream()
                .reduce("", (s1, s2) -> s1.concat(s2)); // Concatena todos os elementos

        System.out.println(concatenacao2);

        //reduce - menor valor
        double reduce = DoubleStream.of(1.5, 2.9, 6.7)
                .reduce(Double.POSITIVE_INFINITY, (d1, d2) -> Math.min(d1, d2));

        System.out.println(reduce);


        // reduce - Combinação: Aplica a primeira função em grupos separados, depois a segunda função nos resultados dos grupos. Pode ganhar performance
        Integer soma3 = list.stream()
                .reduce(0,
                        (n1, n2) -> n1 + n2, //Função acumulativa
                        (n1, n2) -> n1 + n2); // Função de combinação.

        System.out.println(soma3);

        //reduce - map + combiner
        String reduce1 = list.stream()
                .map(n1 -> n1.toString())
                .reduce("",
                        (n1, n2) -> n1.toString().concat(n2.toString()),
                        (n1, n2) -> n1.concat(n2));

        System.out.println(reduce1);
    }
}
