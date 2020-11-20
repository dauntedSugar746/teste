package curso_java.dados_java;

import java.util.Locale; // a classe que tem o locale

public class SaidaDeDadosJava {

	public static void main(String[] args) {
		
		int y = 32;
		double pi = 3.14159265;
		
		int idade = 27;
		String nome = "juliana";
		float renda = (float)4000.00;
		
		System.out.println(y);
		Locale.setDefault(Locale.US); // configura o separador dos estados unidos
		System.out.println("bom dia");	
		System.out.printf("%.4f %n", pi); // mascara para delimitar as casas decimais
		System.out.println("resultado = " + pi + " metros"); // contatena os elementos do print
		System.out.printf("resultado = %.2f metros %n", pi); // usando mascara para formata��o
		System.out.printf("%s tem %d anos e ganha %.2f", nome, idade, renda); // print formatado com varias variaveis
		
		/* 
		System.out.println("ola mundo");
		System.out.println("bom dia");
		*/

	}

}


// exercicios

/*
package curso_java;

import java.util.Locale;

public class SaidaDeDadosJava {

	public static void main(String[] args) {
		
		String product1 = "computer";
		String product2 = "office desk";
		
		byte age = 30;
		short code = 5290;
		
		char gender = 'f';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, which price is $ %.2f %n", product2, price2);
		System.out.printf("%nRecord: %d years old, code %d and gender %s %n ", age, code, gender);
		System.out.printf("%nmeasure with eight decimal places: %.8f %n", measure);
		System.out.printf("rouded (three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
		
		

	}

}
*/
