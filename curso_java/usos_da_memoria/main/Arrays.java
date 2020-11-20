package curso_java.usos_da_memoria.main;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);

        System.out.print("digite a quantidade de vezes a colocar dados: ");
        int n = teclado.nextInt();

        double soma = 0;

        double[] vetor = new double[n];

        for (int c = 0; c < n; c++){

            System.out.printf("digite o %d° numero: ", c + 1);  
            vetor[c] = teclado.nextDouble();

            soma += vetor[c]; 

        }

        double media = soma / n;
        
        System.out.printf("a media dos numeros foi %.2f ", media);  

        teclado.close();

    }

}
