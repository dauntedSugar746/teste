package curso_java.exercicios.classes;
public class Ex3Classe {
     
    public static double preçoDolar;
    public static double quantDolar;

    public static double conversão(){

        preçoDolar *= quantDolar;
        preçoDolar += preçoDolar / 100 * 6;

        return preçoDolar;

    }


}
