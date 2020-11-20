package curso_java.usos_da_memoria.main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        
        List <String> jonas = new ArrayList<>();

        jonas.add("jonas");
        jonas.add("taculo");
        jonas.add("down");
        jonas.add("jonas");
        jonas.add("taculo");
        jonas.add("down");
        jonas.add("down");
        jonas.add(1, "alblei");

        jonas.remove(2);
        jonas.removeIf(x -> x.charAt(0) == 'd');

        for (String pos:jonas){

            System.out.println(pos);

        }

        List <String> lista2 = jonas.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());

        for (String lists:lista2){

            System.out.println(lists);

        }

    }
    
}
