package collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
    public static void main(String[] args) {

        LinkedList<String> list =  new LinkedList<>();
        list.add("Vermelho");
        list.add("Verde");
        list.add("Verde");
        list.add("Amarelo");

        System.out.println(list);
        System.out.println(list.get(1));

        System.out.println("Sorted List: ");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("\nRemovendo o primeiro elemento: ");
        list.removeFirst();
        System.out.println(list);

        System.out.println("\nRemovendo o último elemento: ");
        list.removeLast();
        System.out.println(list);

        System.out.println(list.contains("Vermelho"));



    }
}
