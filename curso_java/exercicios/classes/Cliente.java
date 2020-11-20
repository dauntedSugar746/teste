package curso_java.exercicios.classes;

import curso_java.classes.Scan;

public class Cliente {

    private int numeroConta;
    private String nome;
    private double deposito;

    public Scan sca = new Scan();

    public Cliente(String nome, int numeroConta, double deposito){

        this.nome = nome;
        this.numeroConta = numeroConta;
        this.deposito = deposito;

    }

    public String getNome(){

        return nome;

    }


    public int getNumeroConta(){

        return numeroConta;

    }

    public double getDeposito(){

        return deposito;

    }

    public void maisDeposito(){

        deposito += sca.inputDouble("qual o valor do deposito para adicionar: ");

    }

    public void tirarDeposito(){

        deposito -=  sca.inputDouble("digite o valor a ser retirado: ");
        
        deposito -= 5;

    }


}
