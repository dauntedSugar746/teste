package curso_java.exercicios.classes;
public class Exercicio1Classe {

    public double comprimento;
    public double largura;

    // private double p1;
    // private double p2;

    public double area(){

        return comprimento * largura;

    }

    public double perimetro(){

        // p1 = comprimento * 2;
        // p2 = largura * 2;

        return (comprimento * 2) + (largura * 2);

    }

    public double diagonal(){

        return Math.sqrt(((Math.pow(largura, 2)) + (Math.pow(comprimento, 2))));

    }

}
