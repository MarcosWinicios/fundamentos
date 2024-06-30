package lambda;

import java.util.stream.IntStream;

public class Java8Lambda {
    //Maneiras de declarar uma função lambda
    public static void main(String[] args) {

        //Parenteses
        Runnable runnable = () -> System.out.println("Teste"); // Sem parâmetros

        IntStream.range(0, 5)
                .filter((int n) -> n % 2 == 0) //Informando tipagem
                .reduce((n1, n2) -> n1 + n2) //Mais de um parâmetro
                .ifPresent(System.out::println);

        // Chaves - Precisa utilizar 0 ";" e utilizar o "return" se a função tiver retorno
        IntStream.range(0, 5)
                .filter((int n) -> { // Utilizar mais de uma linha de código dentro da expressão lâmbda
                    System.out.println("Teste");
                    return n % 2 == 0;
                })
                .forEach(System.out::println);
    }
}
