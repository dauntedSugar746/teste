package curso_java.funçoes;

import java.util.Scanner;

public class FunçoesSintaxe {

    public static void print(int valor){

        System.out.print(valor);

    }

    public static int max(int a, int b, int c){

        int maior;

        
        if (a > b && a > c){

            maior = a;

        }else if (b > a && b > c){

            maior = b;

        }else {

            maior = c;

        }

        return maior;

    }
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int num1 = teclado.nextInt();

        System.out.print("digite outro numero: ");
        int num2 = teclado.nextInt();

        System.out.print("digite o ultimo numero: ");
        int num3 = teclado.nextInt();

        print(max(num1, num2, num3));

        teclado.close();

    }
}
