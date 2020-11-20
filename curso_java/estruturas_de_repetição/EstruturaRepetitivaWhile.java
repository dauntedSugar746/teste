package curso_java.estruturas_de_repetição;

import java.util.Scanner;

public class EstruturaRepetitivaWhile {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int num = 1;
        int soma = 0;

        while (num != 0) {

            System.out.print("digite um numero: ");
            num = teclado.nextInt();

            soma += num;

            System.out.printf("por enquanto a soma é %d %n", soma);

        }

        System.out.printf("a soma desses numeros é %d", soma);
        teclado.close();


    }

}
