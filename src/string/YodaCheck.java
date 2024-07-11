package string;

public class YodaCheck {

    public static void main(String[] args) {
        String value = "abc";
//        String value = null; //Remover comentário para forçar o erro na linha 13

        if("abc".equals(value)){//Se a variável value estiver null, não acontece nenhum erro, apenas não entra no IF
            System.out.println("Entrou no IF 1");
        }

        if(value.equals("abc")){ //NullPointerException se a variável "value" estiver com o valor null
            System.out.println("Entrou no IF 2");
        }

        /***
         * Em validações de variáveis do tipo String é recomendado colocar seguir a seguinte sintaxe -> "VALOR_A_SER_COMPARADO.equals(VARIAVEL).
         * Esta prática pode evitar o ocorrência de NullPointerException
         */

    }
}
