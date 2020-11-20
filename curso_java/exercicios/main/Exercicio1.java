package curso_java.exercicios.main;

import curso_java.exercicios.classes.Exercicio1Classe;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Exercicio1Classe triangulo = new Exercicio1Classe();

        System.out.print("digite o comprimento: ");
        triangulo.comprimento = teclado.nextDouble();

        System.out.print("digite a largura: ");
        triangulo.largura = teclado.nextDouble();

        System.out.printf("a area é %.2f %n", triangulo.area());
        System.out.printf("o perimetro é %.2f %n", triangulo.perimetro());
        System.out.printf("a diagonal é %.2f", triangulo.diagonal());        

        teclado.close();


    }
}
