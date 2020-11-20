package curso_java.orientaçao_a_objeto.main;

import curso_java.orientaçao_a_objeto.classes.CauculatorClasse;
import curso_java.classes.Scan;

public class Cauculator {
    public static void main(String[] args) {

        Scan scan = new Scan();

        double raio = scan.inputDouble("digite o raio do circulo: ");
        double circunferencia = CauculatorClasse.circunferencia(raio);
        double volume = CauculatorClasse.volume(raio);

        System.out.printf("A circunferencia equivale a %.2f %n", circunferencia);
        System.out.printf("O volume equivale a %.2f %n", volume);
        System.out.printf("O pi equivale a %.2f %n", CauculatorClasse.PI);

        
    }    
}
