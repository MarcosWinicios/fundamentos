package lambda;

public class LambdaRunnable {
    public static void main(String[] args) {
        // Java 8: FUNÇÕES LAMBDA

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Olá mundo");
            }
        }).run();

        new Thread(() -> System.out.println("Olá mundo")).run();

        //SAM - Single Absctract Method
    }
}
