package optional;

import java.util.Optional;
import java.util.OptionalInt;

public class Java8Optional {

    //Importante nunca utilizar Optional como argumento de métodos, apenas como retorno
    public static void main(String[] args) {

        String s = "1";
//        String s = "test";

//        Integer number =  convertToNumber(s) // Utilizando Optional da classe Wraper Integer
        int number =  convertToPrimitiveNumber(s) // Uttlizando OptionalInt do tipo primitido de números inteiros
//                .ifPresent( n -> System.out.println(n)); // Executa a função lâmbda se houver algum valor dentro
//                .orElse(2); // Retorna uma valor padrão se o Optional for vazio
//                .orElseGet(() -> 5); // Retorna uma função lâmbda se o Optional for vazio
        .orElseThrow(() -> new NullPointerException("Valor null"));

        System.out.println(number);


    }

    public static Optional<Integer> convertToNumber(String numberStr) {

        try {
            return Optional.of(Integer.valueOf(numberStr));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    public static OptionalInt convertToPrimitiveNumber(String numberStr) {

        try {
            return OptionalInt.of(Integer.parseInt(numberStr));
        } catch (Exception e) {
            return OptionalInt.empty();
        }
    }
}
