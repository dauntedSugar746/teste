package curso_java.orientaçao_a_objeto.classes;


public class JogoJava {

    public int user = 0;
    public int computador = (int) randomSel(0, 5);
    
    public double randomSel(int min, int max){

        return Math.floor((min + 1) + Math.random() * ((max + 1) - min));

    }

}
