package collections;

import java.util.List;

public class SequencedCollectionsApp {

    public static void main(String[] args) {
        List<String> list = List.of("Maçã", "Banana", "Uva");

        //Antes do Java 21
        String firstElement = list.iterator().next();
        System.out.println("Primeiro elemento: " + firstElement);

        String lastElement = list.get(list.size() - 1);
        System.out.println("último elemento: " + lastElement);

        System.out.println();

        //Após o Java 21
        String first = list.getFirst();
        System.out.println("Primeiro elemento: " + first);

        String last = list.getLast();
        System.out.println("último elemento: " + last);

        System.out.println();

        System.out.println("Lista original: ");
        System.out.println(list);

        System.out.println("\nLista revertida: ");
        System.out.println(list.reversed());//Não altera a lista original, apenas retorna uma cópia com os elementos invertidos


        System.out.println("\nLista original novamente: ");
        System.out.println(list);
    }
}
