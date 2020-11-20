package curso_java.ia.classes;

import curso_java.classes.SeleçãoAleatoria;

public class Teste1Classe {

    SeleçãoAleatoria rand = new SeleçãoAleatoria();


    
    public double peso1;

    public double peso2;

    public double peso3;

    public double peso4;

    public boolean primeiro = true;
    
    public String[] resposta = new String[2];
    public String[] letras = new String[26];
    public String user;

    public double soma1;
    public double soma2;

    public Teste1Classe(String resposta, String resposta2){

        this.resposta[0] = resposta;
        this.resposta[1] = resposta2;

        
        letras[0] = "a";
        letras[1] = "b";
        letras[2] = "c";
        letras[3] = "d";
        letras[4] = "e";
        letras[5] = "f";
        letras[6] = "g";
        letras[7] = "h";
        letras[8] = "i";
        letras[9] = "j";
        letras[10] = "k";
        letras[11] = "l";
        letras[12] = "m";
        letras[13] = "n";
        letras[14] = "o";
        letras[15] = "p";
        letras[16] = "q";
        letras[17] = "r";
        letras[18] = "s";
        letras[19] = "t";
        letras[20] = "u";
        letras[21] = "v";
        letras[22] = "w";
        letras[23] = "x";
        letras[24] = "y";
        letras[25] = "z";

    }

    private String resp;

    public int randomSel(int min, int max){

        return (int) rand.randomSel(min, max);

    }
    
    public String neuronio2(double dados1, double dados2){

        if (maior(dados1, dados2) == dados1) {

            resp = "bom dia";

        } else {

            resp = "boa noite";
            
        }

        return resp;

    }

    private double maiorNum;   

    private double maior(double dados1, double dados2){


        if (dados1 > dados2){

            maiorNum = dados1;

        }else if (dados2 > dados1){

            maiorNum = dados2;

        }

        return maiorNum;

    }

    public double neuronio1(double dados){

        if (dados < 0){

            return 0;

        }else {

            return dados;

        }

    }

    private double sel;

    public double pesagem(double dados){

        sel = rand.randomSel(-1000, 1000);

        return dados * sel;

        

    }

    public double getSel(){

        return sel;

    }

}
