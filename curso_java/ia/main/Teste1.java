package curso_java.ia.main;

import curso_java.ia.classes.Teste1Classe;
import curso_java.classes.Scan;

public class Teste1 {
    public static void main(String[] args) {

        Teste1Classe ia = new Teste1Classe("bom dia", "boa noite"); // instancia a classe Teste1Classe
        Scan sca = new Scan(); // instancia o scanner


            ia.user = sca.inputString("digite a resposta (bom dia ou boa noite): ").toLowerCase();
            
            System.out.println("a resposta foi: " + ia.user);

            String[] ru = ia.user.split(" "); // define a variavel ru como um split da resposta do usuario

            for (int c = 0; c < ru.length; c++){ // inicia um laço for para decompor a palavra em numeros

                if (c == 1){

                    ia.primeiro = false; // se não for o primeiro for ele define a variavel primeiro para falso

                }

                String palavra = ru[c];

                for (int i = 0; i < 26; i++){

                    if (ia.primeiro == true){

                        ia.soma1 += (ia.soma1 + palavra.indexOf(ia.letras[i]) * 3.25) / 10; // faz o cauculo da posição de cada letra

                    }else{

                        ia.soma2 += (ia.soma2 + palavra.indexOf(ia.letras[i]) * 3.25) / 10;

                    }

                }

            }

            ia.peso1 = ia.peso1 * 864.0; // ia.pesagem(ia.soma1);// coloca os pesos nos valores das palavras
            System.out.println(ia.getSel());
            
            ia.peso2 = ia.peso2 * 554.0; // ia.pesagem(ia.soma2);
            System.out.println(ia.getSel());

            ia.peso3 = ia.peso3 * 133.0; // ia.pesagem(ia.soma1);
            System.out.println(ia.getSel());

            ia.peso4 = ia.peso4 * -795.0; // ia.pesagem(ia.soma2);
            System.out.println(ia.getSel());

            double somaPesos1 = ia.peso1 + ia.peso3;
            double somaPesos2 = ia.peso2 + ia.peso4;

            double neuronioUm = ia.neuronio1(somaPesos1);
            double neuronioDois = ia.neuronio1(somaPesos2);

            System.out.println("pesos finais: ");

            neuronioUm = neuronioUm * 307.0; // ia.pesagem(neuronioUm);
            System.out.println(ia.getSel());

            neuronioDois = neuronioDois * -287.0; // ia.pesagem(neuronioDois);
            System.out.println(ia.getSel());

            String respFinal = ia.neuronio2(neuronioUm, neuronioDois);

            System.out.println(respFinal);

    }
    
}
