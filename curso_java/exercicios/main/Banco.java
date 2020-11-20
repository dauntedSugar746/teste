package curso_java.exercicios.main;

import curso_java.exercicios.classes.Cliente;
import java.util.Scanner;
import curso_java.classes.Scan;

public class Banco {
    public static void main(String[] args) {

        Scan sca = new Scan();
        Scanner teclado = new Scanner(System.in);

        double deposito;

        int numConta = sca.inputInt("digite o numero da conta: ");

        sca.inputString("");

        String nome = sca.inputString("digite o nome do usuario: ");

        System.out.print("vai adicionar um saldo ao banco? s/n: ");
        char sOuN = teclado.next().charAt(0);

        if (sOuN == 's' || sOuN == 'S'){

            deposito = sca.inputDouble("digite o valor do deposito: ");

        }else{

            deposito = 0;

        }

        Cliente cli = new Cliente(nome, numConta, deposito);

        System.out.println("dados da conta: ");
        System.out.printf("conta: %d, nome: %s, saldo: $%.2f %n", cli.getNumeroConta(), cli.getNome(), cli.getDeposito());

        cli.maisDeposito();

        System.out.println("dados da conta: ");
        System.out.printf("conta: %d, nome: %s, saldo: $%.2f %n", cli.getNumeroConta(), cli.getNome(), cli.getDeposito());

        cli.tirarDeposito();

        System.out.println("dados da conta: ");
        System.out.printf("conta: %d, nome: %s, saldo: $%.2f", cli.getNumeroConta(), cli.getNome(), cli.getDeposito());

        teclado.close();

        
    }

}