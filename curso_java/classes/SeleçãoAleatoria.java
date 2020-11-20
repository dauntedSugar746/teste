package curso_java.classes;

public class SeleçãoAleatoria {

    public double randomSel(int min, int max){

        return Math.floor(min + Math.random() * (max - min));

    }
    
}
