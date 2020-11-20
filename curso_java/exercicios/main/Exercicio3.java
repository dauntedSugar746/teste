package curso_java.exercicios.main;

import curso_java.exercicios.classes.Exercicio3Classe;
import curso_java.classes.Scan;

public class Exercicio3 {
    public static void main(String[] args) {

        Exercicio3Classe aluno = new Exercicio3Classe();

        Scan scan = new Scan();

        aluno.nome = scan.inputString("digite o nome: ");

        aluno.nota1 = scan.inputDouble("digite a primeira nota: ");
        aluno.notaFinal += aluno.nota1;

        aluno.nota2 = scan.inputDouble("digite a segunda  nota: ");
        aluno.notaFinal += aluno.nota2;

        aluno.nota3 = scan.inputDouble("digite a terceira nota: ");
        aluno.notaFinal += aluno.nota3;

        aluno.passou = (aluno.notaFinal >= 60)?"passou":"reprovou";

        /*
        aluno.passou = (aluno.notaFinal >= 60)?true:false;

        if (aluno.passou == true){

            System.out.printf("parabens %s !!! passou de ano %n", aluno.nome);

        }else {

            System.out.printf("não passou %s ! faltou %.2f pontos ! %n", aluno.nome, 60 - aluno.notaFinal);


        }

        System.out.printf("a sua nota foi: %.2f", aluno.notaFinal);
        */

        if (aluno.passou == "passou"){

            System.out.printf("parabens %s !!! passou de ano %n", aluno.nome);

        }else {

            System.out.printf("não passou %s ! faltou %.2f pontos ! %n", aluno.nome, 60 - aluno.notaFinal);


        }

        System.out.printf("a sua nota foi: %.2f", aluno.notaFinal);

        
    }

}
