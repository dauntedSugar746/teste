package curso_java.estruturas_condicionais;

import java.util.Scanner;

public class EstruturasCondicionaisJava {
	
	public void print(String texto) {
		
		System.out.println(texto);
		
	}

	public static void main(String[] args) {
		
		// estrutura condicional
		
		EstruturasCondicionaisJava func = new EstruturasCondicionaisJava();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("digite a hora: ");
		int hora = teclado.nextInt();
		
		if (hora < 12) {
			
			 func.print("bom dia");
			
		}else if (hora > 12 && hora < 19) {
			
			func.print("boa tarde");
			
		}else {
			
			func.print("boa noite");
			
		}
	
		teclado.close();
		
		// esses s�o os operadores logicos e relacionais do java
		
		/*
		boolean cond = 5 < 6; // true
		boolean cond2 = 5 > 6; // false
		boolean cond3 = 5 < 6 && 1 < 0; // false
		
		System.out.println(cond);
		System.out.println(cond2);
		System.out.println(cond3);
		*/

		
		
	}
	


}
