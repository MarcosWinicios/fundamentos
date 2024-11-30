package collections;

import estruturadedados.listadinamica.main;

import java.util.HashMap;

public class HashMapApp {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Bruno");
        map.put(2, "Umberto");
        map.put(3, "Fernando");
        map.put(3, "Caetano");
        map.put(4, "Umberto");

        System.out.println(map);
    }
}
