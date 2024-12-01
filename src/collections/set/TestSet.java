package collections.set;

import collections.model.Course;

import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {

        //Criar os cursos disponíveis no site para venda
        Course java8 = new Course(1, "Java 8 Para Web", 2000, Paths.get("/java8"));
        Course oracle12c = new Course(2, "Oracle 12C", 2500, Paths.get("/oracle12C"));
        Course php7 = new Course(3, "PHP7", 1500, Paths.get("/php7"));

        Set<Course> coursesA = new HashSet<>();
        Set<Course> coursesB = new HashSet<>();

        coursesA.add(java8);
        coursesA.add(oracle12c);
        coursesA.add(php7);

        coursesB.add(java8);

        System.out.println("Courses A: \n" + coursesA);
        System.out.println("Courses B: \n" + coursesA);

        System.out.println();

        //interseção entre A e B
        Set<Course> intersec = new HashSet<>(Set.copyOf(coursesA));
        intersec.retainAll(coursesB);
        System.out.println("A intersec B: \n" + intersec);

        System.out.println();

        //A - B
        Set<Course> onlyA = new HashSet<>(Set.copyOf(coursesA));
        onlyA.removeAll(coursesB);
        System.out.println("Only A: \n" + onlyA);

        System.out.println();

        //B - A
        Set<Course> onlyB = new HashSet<>(Set.copyOf(coursesB));
        onlyB.removeAll(coursesA);
        System.out.println("Only B: \n" + onlyB);

        System.out.println();

        //A + B
        Set<Course> unionAll = new HashSet<>(Set.copyOf(coursesA));
        unionAll.addAll(coursesB);
        System.out.println("Union between A and B: \n" + unionAll);


        ClientSet clientA = new ClientSet("111.111.111.11", "Cliente A", "clienteA@gmail.com");
        ClientSet clientB = new ClientSet("222.222.222.22", "Cliente B", "clienteB@gmail.com");

        clientA.setCourses(coursesA);
        clientB.setCourses(coursesB);

        System.out.println("\nClientes: ");
        System.out.println(clientA);
        System.out.println();
        System.out.println(clientB);


    }
}
