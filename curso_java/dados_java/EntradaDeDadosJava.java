package curso_java.dados_java;

import java.util.Scanner; // importa a classe Scanner

public class EntradaDeDadosJava {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); // cria o objeto teclado com a classe Scanner
		
		String s1, s2, s3;
		
		System.out.print("digite algo: ");
		s1 = teclado.nextLine();
		
		System.out.print("digite outra coisa: ");
		s2 = teclado.nextLine();
		
		System.out.print("digite mais um: ");
		s3 = teclado.nextLine();
		
		System.out.printf("%s, %s, %s", s1, s2, s3);
		
		teclado.close();
		
		/*
		System.out.print("digite o nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("digite a idade: ");
		int idade = teclado.nextInt();
		
		System.out.print("digite a altura: ");
		double altura = teclado.nextDouble();
		
		System.out.printf("o nome � %s, tem %d anos e %.2f de altura", nome, idade, altura);
		
		teclado.close();
		
		// pegando a apenas uma letra do input
		
		/*
		
		System.out.print("digite uma letra: ");
		char letra = teclado.next().charAt(0);
		
		System.out.printf("a primeira letra digitada foi %s", letra);
		
		teclado.close();
		
		// esse pega numeros quebrados
		
		/*
		
		Locale.setDefault(Locale.JAPANESE);
		
		double num;
		
		System.out.print("digite um numero quebrado: ");
		num = teclado.nextDouble();
		
		System.out.printf("o numero escolhido foi: %.2f", num);
		
		teclado.close();
		
		// dessa forma pega numeros inteiros
		
		/*
		
		long num;
		
		System.out.print("digite um numero: ");
		num = teclado.nextLong();
		
		System.out.printf("o numero escolhido foi: %d", num);
		
		teclado.close();
		
		
		// essa forma pega strings inves de numeros
		
		/*
		
		System.out.print("digite o nome: "); // apenas mostra na tela oque � para ser digitado
		String nome = teclado.next(); // cria o input e mostra na tela
		
		System.out.printf("ola %s!, muito prazer em te conhecer %n", nome); // usa as mascaras para escrever o nome
		
		teclado.close(); // fecha o objeto teclado
		*/

	}

}
