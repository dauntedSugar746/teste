package curso_java.usos_da_memoria.main;

import curso_java.classes.Scan;
import curso_java.usos_da_memoria.classes.Array2Classe;

public class Array2 {
    public static void main(String[] args) {

        Scan sca = new Scan();

        int n = sca.inputInt("digite a quantidade de vezes: ");
        double soma = 0;

        Array2Classe[] vetor = new Array2Classe[n];

        for (int c = 0; c < vetor.length; c++){

            sca.inputString("");

            String nome = sca.inputString("digite o nome do produto: ");
            double preço = sca.inputDouble("digite o preço: ");

            vetor[c] = new Array2Classe(nome, preço);

        }

        for (int c = 0; c < vetor.length; c++){

            soma += vetor[c].getPreço();

        }

        System.out.printf("o preço medio foi $ %.2f", soma / vetor.length);

    }
}
