package collections.factory;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryOfApp {

    public static void main(String[] args) {

        //List.of()
        List<String> list = List.of("Maçã", "banana", "uva");
        System.out.println(list);

        //Set.of()
        Set<Integer> set = Set.of(1,2,3,4,5);
        System.out.println(set);

        //Map.of()
        Map<String, Integer> map = Map.of("um", 1, "dois", 2, "três", 3);
        System.out.println(map);

        try{
            list.add("Laranja");
            set.add(6);
            map.put("quatro", 4);
        }catch (Exception e){
            throw new RuntimeException("Não é possível alterar coleções que foram criadas de maneira imutável!\n" + e);
        }

    }

}
