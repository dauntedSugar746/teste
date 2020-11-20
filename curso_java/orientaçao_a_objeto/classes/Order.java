package curso_java.orientaçao_a_objeto.classes;

import java.util.Date;

public class Order {

    // aqui pode ser acessado os atributos da classe produto pois eles estão sem modificadores de acesso e esta classe esta no mesmo pacote

    private Date data;
    private Produtos produto;

    public Order(Date data, Produtos produto){

        this.data = data;
        this.produto = produto;

    }

    public Date getData(){

        return data;

    }

    public void setData(Date data){

        this.data = data;

    }

    public Produtos getProdutos(){

        return produto;

    } 

    public void setProdutos(String nome, double preço, int quantidade){

        this.produto.nome = nome;
        this.produto.preço = preço;
        produto.quantEmEstoque = quantidade;
    }
    
}
