package curso_java.exercicios.main;

import curso_java.classes.Scan;
import curso_java.exercicios.classes.Ex3Classe;

public class Ex3 {
    public static void main(String[] args) {

        Scan scan = new Scan();
        
        Ex3Classe.preçoDolar = scan.inputDouble("digite o preço do dolar: ");
        Ex3Classe.quantDolar = scan.inputDouble("digite a quantidade de dolar: ");

        System.out.printf("ficara $ %.2f reais", Ex3Classe.conversão());

    }
}
