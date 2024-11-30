package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapApp {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "Bruno");
        map.put(2, "Umberto");
        map.put(3, "Fernando");
        map.put(3, "Caetano");
        map.put(4, "Umberto");

        System.out.println(map);
    }
}
