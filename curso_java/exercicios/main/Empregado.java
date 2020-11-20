package curso_java.exercicios.main;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import curso_java.exercicios.classes.EmpregadoClasse;

public class Empregado {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("digite a quantidade de empregados: ");
        int quant = teclado.nextInt();

        int id;
        String nome;
        double salario;

        List <EmpregadoClasse> func = new ArrayList<>();


        for (int cont = 0; cont < quant; cont++){

            System.out.print("digite o id: ");
            id = teclado.nextInt();

            teclado.nextLine();

            System.out.print("digite o nome: ");
            nome = teclado.nextLine();

            System.out.print("digite o salario: ");
            salario = teclado.nextDouble();

            func.add(new EmpregadoClasse(id, nome, salario));

        }

        boolean temId = false;
        
        System.out.print("digite o id a ser visto: ");
        Integer loc = teclado.nextInt();

        System.out.print("digite o aumento: ");
        Double aumento = teclado.nextDouble();

        for (EmpregadoClasse itens : func){

            if (itens.getId() != loc){

                temId = false;

            }else if (itens.getId() == loc){

                temId = true;
                break;

            }

        }

        if (temId != true){

            System.out.println(" ");
            System.out.println("esse id não existe");
            System.out.println(" ");

        }

        for (EmpregadoClasse item : func){

            if (item.getId() == loc){

                System.out.printf("%s, %d, $%.2f%n", item.getNome(), item.getId(), item.setSalario(aumento));

            }else if (item.getId() != loc){

                System.out.printf("%s, %d, $%.2f%n", item.getNome(), item.getId(), item.getSalario());

            }

        }


        teclado.close();

    }

    }

