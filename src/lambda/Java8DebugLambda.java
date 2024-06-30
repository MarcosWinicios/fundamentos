package lambda;

import java.util.Arrays;
import java.util.List;

public class Java8DebugLambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 8, 9);

        list.stream()
                .peek(n -> System.out.println(n + "Teste")) // Auxiliar no debug
                .filter(n -> n % 2 == 0)
//        	.map( n -> convertToStringBuilder(n))
                .peek(n -> System.out.println(n + "Novo teste"))
                .forEach(System.out::println);
    }

    private static StringBuilder convertToStringBuilder(Integer n) {
        StringBuilder builder = new StringBuilder();
        builder.append(n);
        builder.append("s");
        builder.append("a");
        return builder;
    }
}
