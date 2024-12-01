package collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeHashSetApp {

    public static void main(String[] args) {
        Set<String> list =  new TreeSet<>();
        list.add("Vermelho");
        list.add("Verde");
        list.add("Verde");
        list.add("Amarelo");

        System.out.println(list);

        System.out.println(list.contains("Vermelho"));
    }
}
