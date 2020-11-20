package curso_java.orientaçao_a_objeto.classes;

import curso_java.classes.Scan;

public class Produtos {

    Scan sc = new Scan();
    
    String nome;
    double preço;
    int quantEmEstoque;

    private int adicionarDoEstoque;
    private int tirarDoEstoque;

    public Produtos(String nome, double preço, int quantEmEstoque){

        this.nome = nome;
        this.preço = preço;
        this.quantEmEstoque = quantEmEstoque;

    }

    public Produtos(String nome, double preço){

        this.nome = nome;
        this.preço = preço;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public String getNome(){

        return nome;

    }

    public void setPreço(double preço){

        this.preço = preço;

    }

    public double getPreço(){

        return preço;

    }

    public void setQuantEmEstoque(int quantEmEstoque){

        this.quantEmEstoque = quantEmEstoque;

    }

    public int getQuantEmEstoque(){

        return quantEmEstoque;

    }



    public double valorDeEstoque(){

        return quantEmEstoque * preço;


    }

    public void colocarNoEstoque(){

        adicionarDoEstoque = sc.inputInt("quantos produtos quer adicionar no estoque: ");
        quantEmEstoque += adicionarDoEstoque;

    }

    public void retirarDoEstoque(){

        tirarDoEstoque = sc.inputInt("quantos voce quer tirar do estoque: ");
        this.quantEmEstoque -= tirarDoEstoque;

    }


}
