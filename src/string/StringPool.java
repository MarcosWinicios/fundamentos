package string;

public class StringPool {

    public static void main(String[] args) {

        String s1 =  "abc";
        String s2 = s1;
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println("a: " + s1);
        System.out.println("b: " + s2);

        System.out.println(s1 == s2); // Mesmo endereço de memória
        System.out.println(s3 == s4); // Endereços de memória diferentes
        System.out.println(s3 == s1); //Endereços de memórias diferentes

        System.out.println(s1.equals(s3)

        /**
         * O operador == compara endereço de memória, e não o conteúdo
         * O operador new cria uma nova instância independente do valor da variável
         * O operador = na String, aponta o endereço de memória de uma variável para a que está a direita
         * O equals compara o valor independente do endereço de memória
         */


    }
}
