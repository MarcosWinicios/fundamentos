package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class NoteBook {

    static ArrayList<String> annotationsArrayList;
    static LinkedList<String> annotationsLinkedList;

    public static void main(String[] args) {
        testArrayList();
        testLinkedList();
    }

    private static void testArrayList(){
        System.out.println("\nTeste array list: ");
        double time1 = System.currentTimeMillis();
        annotationsArrayList = new ArrayList<>();

        annotationsArrayList.add("Comprar pães");
        annotationsArrayList.add("Vender Carro");
        annotationsArrayList.add("Reunião às 11h30");

        for(int i = 0; i < 1003;  i++){
            annotationsArrayList.add("texto " + i);
        }

//        System.out.println(annotations);

        double time2 = System.currentTimeMillis();

        System.out.println("Tempo gasto: " + (time2 - time1) / 1000);
    }


    private static void testLinkedList(){
        System.out.println("\nTeste linked list: ");
        double time1 = System.currentTimeMillis();
        annotationsLinkedList = new LinkedList<>();

        annotationsLinkedList.add("Comprar pães");
        annotationsLinkedList.add("Vender Carro");
        annotationsLinkedList.add("Reunião às 11h30");

        for(int i = 0; i < 1003;  i++){
            annotationsLinkedList.add("texto " + i);
        }

//        System.out.println(annotations);

        double time2 = System.currentTimeMillis();

        System.out.println("Tempo gasto: " + (time2 - time1) / 1000);
    }
}
