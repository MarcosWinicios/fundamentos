package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaStream {
    public static void main(String[] args) {
        // stream - fluxo de dados

        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        asList.stream()
                .filter( e -> e % 2 == 0)
                .filter(e -> e > 2)
                .forEach(e -> System.out.println(e));
    }
}
