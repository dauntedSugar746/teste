package curso_java.exercicios.classes;

import java.util.Scanner;

public class Exercicio2Classe {
    
    public String nome;
    public double salario;
    public double imposto;
    public double salarioImp;
    public double aumento;
    public double porcentagem;

    public double inputDouble(Scanner scanner, String texto ){

        System.out.print(texto);
        return scanner.nextDouble();

    }

    public String inputString(Scanner scanner, String texto ){

        System.out.print(texto);
        return scanner.nextLine();

    }


}
