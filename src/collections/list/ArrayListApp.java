package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {

        List<String> list =  new ArrayList<>();
        list.add("Vermelho");
        list.add("Verde");
        list.add("Verde");
        list.add("Amarelo");

        System.out.println(list);

        System.out.println("Sorted List: ");
        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.contains("Vermelho"));

    }
}
