package curso_java.outros_topicos;

import java.util.Scanner;
import curso_java.orientaçao_a_objeto.classes.JogoJava;

public class JogoEmJava {

    public static void main(String[] args) throws InterruptedException {
        
       JogoJava jogo = new JogoJava();

       Scanner teclado = new Scanner(System.in);

       System.out.print("pensei em um numero entre 0 e 5 tente adivinhar: ");

        jogo.user = teclado.nextInt();


        if (jogo.user != jogo.computador){

            while (jogo.user != jogo.computador) {

                System.out.print("errou tente novamente: ");

                jogo.user = teclado.nextInt();

                System.out.println("processando...");

                Thread.sleep(1000);


            }

        }

        System.out.println("parabens voce ganhou");

        teclado.close();

    
    }

}
