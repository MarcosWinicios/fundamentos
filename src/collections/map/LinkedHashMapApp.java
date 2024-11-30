package collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMapApp {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(4, "Bruno");
        map.put(2, "Umberto");
        map.put(3, "Fernando");
        map.put(3, "Caetano");
        map.put(1, "Umberto");

        System.out.println(map);
    }
}
