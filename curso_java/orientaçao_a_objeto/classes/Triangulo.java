package curso_java.orientaçao_a_objeto.classes;
public class Triangulo {
    
    public double a;
    public double b;
    public double c;

    private double p = 0;

    public double area(){

        p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }


}
