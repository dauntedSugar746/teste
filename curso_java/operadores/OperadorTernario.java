package curso_java.operadores;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("digite o preço: ");
		
		int jonas = 11;
		
		double preço = teclado.nextDouble();
		double desconto = (preço < 20.0) ? preço * 0.1 : preço * 0.05;
		
		double teste1 = 10.00;
		
		/*
		if (preço < 20.0) {
			
			desconto = preço * 0.1;
			
		}else {
			
			desconto = preço * 0.5;
			
		}
		*/
		
		System.out.print(preço - desconto);
		
		System.out.print(teste1);
		
		System.out.print(jonas);
		
		teclado.close();

	}

}