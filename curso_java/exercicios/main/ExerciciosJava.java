package curso_java.exercicios.main;

import java.util.Scanner;

public class ExerciciosJava {
	
	
	public void print(String texto) {
		
		System.out.println(texto);
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ExerciciosJava exJava = new ExerciciosJava();
		
		System.out.print("digite o tempo da liga��o: ");
		double tempo = teclado.nextDouble();
		double totPag = 0;
		
		if (tempo > 100) {
			
			totPag += 50 + ((tempo - 100) * 2.0);
			System.out.printf("o total a pagar a mais sera R$ %.2f", totPag);
			
		}else {
			
			exJava.print("o total a pagar ser� apenas R$50.00");
			
		}
		
		teclado.close();
		

	}

}
