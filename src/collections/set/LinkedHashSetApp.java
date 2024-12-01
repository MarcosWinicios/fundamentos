package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {

    public static void main(String[] args) {
        Set<String> list =  new LinkedHashSet<>();
        list.add("Vermelho");
        list.add("Verde");
        list.add("Verde");
        list.add("Amarelo");

        System.out.println(list);

        System.out.println(list.contains("Vermelho"));
    }
}
