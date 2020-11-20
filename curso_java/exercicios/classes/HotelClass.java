package curso_java.exercicios.classes;

public class HotelClass {

    private String nome;
    private String eMail;

    public  HotelClass(String nome, String eMail){

        this.nome = nome;
        this.eMail = eMail;

    }

    public String getNome(){

        return nome;

    }

    public String getEmail(){

        return eMail;

    }
    
}
