package curso_java.outros_topicos;
public class SleepJava {

    public static void wait(int seconds) throws InterruptedException {

        Thread.sleep(seconds * 1000);

    }
    public static void main(String[] args) throws InterruptedException { // precisa desse throws InterruptedException para funcionar
    
        for (int cont = 10; cont >= 1; cont --){

            System.out.println(cont);

            Thread.sleep(1000); // faz o programa esperar tantos milisegundos;

        }

        System.out.println("feliz ano novo !!!");


    }
    
}
