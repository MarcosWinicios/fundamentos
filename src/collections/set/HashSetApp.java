package collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {

    public static void main(String[] args) {
        Set<String> list =  new HashSet<>();
        list.add("Vermelho");
        list.add("Verde");
        list.add("Verde");
        list.add("Amarelo");

        System.out.println(list);

        System.out.println(list.contains("Vermelho"));
    }
}
