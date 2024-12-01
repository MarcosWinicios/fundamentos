package collections.map;

import collections.model.Client;
import collections.model.Course;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestMap {

    static Map<Client, List<Course>> payments = new HashMap<>();

    public static void main(String[] args) {
        //Criar os cursos disponíveis no site para venda
        Course java8 = new Course(1, "Java 8 Para Web", 2000, Paths.get("/java8"));
        Course oracle12c = new Course(2, "Oracle 12C", 2500, Paths.get("/oracle12C"));
        Course php7 = new Course(3, "PHP7", 1500, Paths.get("/php7"));

        //Cadastrar cliente

        Client antonio = new Client("111.111.111.11", "Marcos Sampaio Jr", "antonio@gmail.com");


        //Criar a lista de cursos do cliente
        List<Course> antonioCourseList = new LinkedList<>();


        //Fazer um checkout dos cursos escolhidos

        Scanner input = new Scanner(System.in);

        int option = 0;
        while (option != 4){
            System.out.println("Qual curso deseja adquirir: [1-Java 8], [2-Oracle 12C], [3 - PHP7], [4-Finalizar Compra]");
            option = input.nextInt();
            if(option == 1){
                antonioCourseList.add(java8);
            } else if (option == 2) {
                antonioCourseList.add(oracle12c);
            }else if (option == 3){
                antonioCourseList.add(php7);
            }else {
                option = 4;
            }
        }
        input.close();

        payments.put(antonio, antonioCourseList);
        System.out.println(payments);
    }

}
