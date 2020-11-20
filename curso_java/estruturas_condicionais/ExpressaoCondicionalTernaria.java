package curso_java.estruturas_condicionais;

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("digite um numero: ");
		int num1 = teclado.nextInt();
		
		System.out.print("digite outro numero: ");
		int num2 = teclado.nextInt();
		
		String igualOuMaior = num1 > num2 || num1 == num2 ? "maior ou igual":"menor ou diferente";
		
		System.out.print(igualOuMaior);
		
		teclado.close();

	}

}
