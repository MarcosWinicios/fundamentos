package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {

    public static void main(String[] args) {
        Deque<String> list = new ArrayDeque<>();

        list.add("Vermelho");
        list.add("Verde");
        list.add("Verde");
        list.add("Amarelo");

        System.out.println(list);

        printFirstAndLast(list);

        System.out.println("Sorted List: ");

        System.out.println(list);

        System.out.println("\nRemovendo o primeiro elemento: ");
        list.removeFirst();
        System.out.println(list);

        System.out.println("\nRemovendo o último elemento: ");
        list.removeLast();
        System.out.println(list);

        System.out.println("\nAdicionando elemento no inicio da lista: ");
        list.addFirst("Azul");
        System.out.println(list);

        System.out.println("\nAdicionando elemento no Fim da lista: ");
        list.addLast("Preto");
        System.out.println(list);


        String isPresentElement = "Vermelho";
        System.out.println("\nO valor [" + isPresentElement + "] está presente? " + list.contains(isPresentElement));
    }

    private static <T> void printFirstAndLast(Deque<T> deque){
        System.out.println("\nFirst: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast() + "\n");
    }
}
