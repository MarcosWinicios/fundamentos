package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8StreamsCreation {

    public static void main(String[] args) throws IOException {
        //Colletion -> Utilizar com Classes que implementam Collection
        System.out.println("\n----Collection\n");
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        list.stream().forEach(System.out::println);

        //Arrays -> Utilizar com arrays
        System.out.println("\n----Arrays\n");
        Integer[] intArray = new Integer[]{1, 2, 3, 4};
        Arrays.stream(intArray).forEach(System.out::println);

        //Stream.of -> Criar um Stream de qualquer tipagem
        System.out.println("\n----Stream.of\n");
        Stream.of("Se", "inscreva", "no", "canal", "!").forEach(System.out::println);

        //IntStream.range/rangeClosed -> Criar um Stream de um rage de valores
        System.out.println("\n----IntStream.range/rangeClosed\n");
        IntStream.range(0, 5).forEach(System.out::println); //Exclui o último valor
        System.out.println(" ");
        IntStream.rangeClosed(0, 5).forEach(System.out::println); //Inclui o último valor

        //Stream.iterate -> Passa um valor inicial, e o que vai acontecer com esse valor inicial
        System.out.println("\n----Stream.iterate\n");
        Stream.iterate(5, n -> n * 2) //(valor inicial, lambda manipulando o valor inicial para gerar o próximo)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("\n_______LEITURA DE ARQUIVOS_______\n");

        //BufferedReader -> lines
        // arquivo streams.txt - 11, 12, 13
        System.out.println("\n----BufferedReader\n");

        File file = new File("streams.txt");
        FileReader in = new FileReader(file);

        try (BufferedReader br = new BufferedReader(in)) {
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Files - Stream de todos os paths que estão dentro de do path informado (subdiretórios de um diretório)
        System.out.println("\n----Files\n");
        Path p = Paths.get("");
        Files.list(p).forEach(System.out::println);

        //Random -> Criar Streams de números inteiros aleatórios
        System.out.println("\n----Random\n");
        new Random().ints()
                .limit(10)
                .forEach(System.out::println);

        //Pattern -> Criar um Stream de partes de uma String, a partir do regex que irá fazer o split desta string
        System.out.println("\n----Random\n");
        String s = "Deixe um curtir no vídeo!";
        Pattern pattern = Pattern.compile(" ");
        pattern.splitAsStream(s).forEach(System.out::println);
    }
}
