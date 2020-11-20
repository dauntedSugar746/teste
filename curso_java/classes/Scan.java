package curso_java.classes;

import java.util.Scanner;

public class Scan {

    private Scanner teclado = new Scanner(System.in);


    public short inputShort(String texto){

        System.out.print(texto);
        return teclado.nextShort();

    }
    
    public long inputLong(String texto){

        System.out.print(texto);
        return teclado.nextLong();

    }
    
    public boolean inputBool(String texto){

        System.out.print(texto);
        return teclado.nextBoolean();

    }
    
    public float inputFloat(String texto){

        System.out.print(texto);
        return teclado.nextFloat();

    }
    
    public byte inputByte(String texto){

        System.out.print(texto);
        return teclado.nextByte();
        
    }

    public int inputInt(String texto ){

        System.out.print(texto);
        return teclado.nextInt();

    }
    
    public double inputDouble(String texto ){

        System.out.print(texto);
        return teclado.nextDouble();

    }

    public String inputString(String texto ){

        System.out.print(texto);
        return teclado.nextLine();

    }


}
