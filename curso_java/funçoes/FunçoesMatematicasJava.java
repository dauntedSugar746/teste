package curso_java.funçoes;

import java.util.Scanner;

public class FunçoesMatematicasJava {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.print("digite um numero e veja ele elevado ao quadrado: ");
		a = Math.pow(teclado.nextDouble(), 2);
		
		System.out.print("digite outro numero: ");
		b = Math.abs(teclado.nextDouble());
		
		System.out.print("digite mais um numero: ");
		c = Math.sqrt(teclado.nextDouble());
		
		System.out.printf("a eleva��o fica %.2f, o valor absoluto fica %.2f e a raiz quadrada fica %.2f", a, b, c);
		
		teclado.close();

	}

}
