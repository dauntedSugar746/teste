package curso_java.outros_topicos;

import curso_java.classes.SeleçãoAleatoria;
import curso_java.classes.CodBinClass;

public class CodigoBinario {
    public static void main(String[] args) {
        
        SeleçãoAleatoria rand = new SeleçãoAleatoria();
        CodBinClass cod = new CodBinClass();


        for (cod.cont = 0; cod.cont < 100000; cod.cont ++){

            cod.randSel = (int) rand.randomSel(0, 2);

            cod.cont2 ++;

            if (cod.randSel == 0){

                cod.quantZero ++;
                System.out.print(0);

            }else{

                System.out.print(1);

            }


        }

        System.out.println();

        System.out.println(cod.quantZero);

        System.out.println(cod.cont2);

        cod.chance = cod.cont2 / cod.quantZero;

        System.out.println();
        System.out.printf("a chance de sair um zero é de %.4f por cento", cod.chance);

        



    }
    
}
