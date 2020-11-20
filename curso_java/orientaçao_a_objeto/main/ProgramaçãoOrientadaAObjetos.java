package curso_java.orientaçao_a_objeto.main;

import java.util.Scanner;

import curso_java.orientaçao_a_objeto.classes.Triangulo;

public class ProgramaçãoOrientadaAObjetos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("coloque as medidas do triangulo 1: ");

        x.a = teclado.nextDouble();
        x.b = teclado.nextDouble();
        x.c = teclado.nextDouble();

        System.out.println("digite as medidas do segundo triangulo: ");

        y.a= teclado.nextDouble();
        y.b = teclado.nextDouble();
        y.c = teclado.nextDouble();

        double areaX = x.area();


        double areaY = y.area();

        System.out.printf("a area do primeiro triangulo é %.3f%n", areaX);
        System.out.printf("a area do segundo triangulo é %.3f%n", areaY);

        if (areaX > areaY){

            System.out.println("o primeiro triangulo é maior");

        }else if (areaY > areaX){

            System.out.println("o segundo trinagulo é maior");

        }else{

            System.out.println("os dois triangulos são iguais");

        }

        teclado.close();

        
    }
}
