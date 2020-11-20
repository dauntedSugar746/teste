package curso_java.orientaçao_a_objeto.main;

import curso_java.orientaçao_a_objeto.classes.Produtos;
import curso_java.classes.Scan;

public class POOEx2 {
    public static void main(String[] args) {

        Scan sc = new Scan();

        String nome = sc.inputString("digite o nome do produto: ");
        double preço = sc.inputDouble("digite o preço do produto: ");
        int quantEmEstoque = sc.inputInt("digite a quantidade em estoque: ");

        Produtos pro = new Produtos(nome, preço, quantEmEstoque);

        pro.setQuantEmEstoque(101);

        System.out.printf("dados dos produtos: nome: %s, preço: $ %.2f, quantidade em estoque: %d, valor total $ %.2f %n", pro.getNome(), pro.getPreço(), pro.getQuantEmEstoque(), pro.valorDeEstoque());

        pro.colocarNoEstoque();

        System.out.printf("agora há %d produtos no estoque com o valor de %.2f %n", pro.getQuantEmEstoque(), pro.valorDeEstoque());

        pro.retirarDoEstoque();

        System.out.printf("agora há %d produtos no estoque com o valor de %.2f", pro.getQuantEmEstoque(), pro.valorDeEstoque());



    }

}