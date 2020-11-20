package curso_java.exercicios.main;

import curso_java.exercicios.classes.Exercicio2Classe;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Exercicio2Classe funcionario = new Exercicio2Classe();
        Scanner teclado = new Scanner(System.in);

         
        funcionario.nome = funcionario.inputString(teclado, "digite o nome: ");

        funcionario.salario = funcionario.inputDouble(teclado, "digite o salario: ");
        funcionario.salarioImp = funcionario.salario;

        funcionario.imposto = funcionario.inputDouble(teclado, "digite o imposto: ");

        funcionario.salario = funcionario.salario - funcionario.imposto;


        System.out.printf("informaçoes do funcionario: nome %s, salario: $ %.2f %n", funcionario.nome, funcionario.salario);

        funcionario.porcentagem = funcionario.inputDouble(teclado, "digite a porcentagem de aumento: ");

        funcionario.salarioImp = (funcionario.salarioImp / 100) * funcionario.porcentagem;

        funcionario.salario += funcionario.salarioImp;

        System.out.printf("o salario do funcionario ficara: $ %.2f", funcionario.salario);
    }
}
