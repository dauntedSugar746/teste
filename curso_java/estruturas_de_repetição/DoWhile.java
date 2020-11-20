package curso_java.estruturas_de_repetição;
public class DoWhile {
    public static void main(String[] args) throws InterruptedException {
        
        int cont = 0;
        
        do{
            Thread.sleep(1000);
            System.out.println(cont);
            cont ++;
        } while (cont <= 10);

    }

}
