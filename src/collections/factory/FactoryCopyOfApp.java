package collections.factory;

import java.util.ArrayList;
import java.util.List;

public class FactoryCopyOfApp {


    public static void main(String[] args) {
        //criando lista original

        List<String> originalList = new ArrayList<>();

        originalList.add("Maçã");
        originalList.add("Banana");
        originalList.add("Laranja");

        //Criando uma cópia imutável da lista original
        List<String> immutableList = List.copyOf(originalList);

        printLists(originalList, immutableList);

        //Tentativa de adicionar uma elemento à lista imutável
        //Deve lançar a exceção UnsupportedOperationException
        try {
            originalList.add("Pera");
            immutableList.add("Pera");
        }catch (UnsupportedOperationException e){
            System.out.println("Não é possível modificar a lista imutável!\n" + e);
        }

        printLists(originalList, immutableList);
    }

    private static  <T> void printLists(List<T> originalList, List<T> immutableList){
        System.out.println();
        System.out.println("Lista original: ");
        System.out.println(originalList);

        System.out.println("Lista imutável: ");
        System.out.println(immutableList);
        System.out.println();
    }
}
