package curso_java.estruturas_de_repetição;

import java.util.Scanner;

public class EstruturaRepetitivaFor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("digite o numero maximo de numeros: ");

        int maior = teclado.nextInt() + 1;
        int vezes = 1;
        
        for (int c = 1; c != maior; c++){

            System.out.println(c);

            vezes *= c;

            if (c == 10) {
                
                System.out.println("dez");

            }

        }

        System.out.printf("o vezes é igual a %d", vezes);

        teclado.close();

    }

}
