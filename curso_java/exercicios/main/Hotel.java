package curso_java.exercicios.main;

import curso_java.exercicios.classes.HotelClass;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        HotelClass[] hotel = new HotelClass[10];

        System.out.print("digite a quantidade de quartos: ");
        int quantQuartos = teclado.nextInt();

        for (int c = 0; c < quantQuartos; c++){

            System.out.print("digite o seu nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine();

            System.out.print("digite o seu e-mail: ");
            String eMail = teclado.nextLine();

            System.out.print("digite o seu quarto: ");
            int quarto = teclado.nextInt();

            hotel[quarto] = new HotelClass(nome, eMail);

        }

        for (int c = 0; c < hotel.length; c++){

            if (hotel[c] != null){

                System.out.println(c + ": nome: " + hotel[c].getNome() + ", email: " + hotel[c].getEmail());

            }

        }

        teclado.close();
        
    }
    
}
