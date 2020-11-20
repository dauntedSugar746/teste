package curso_java.primeiro_programa_e_variaveis;

public class VariaveisEmJava {

	public static void main(String[] args) {
		
		// uma variavel contem <tipo> <nome> = <valor>; exp:
		
		// byte idade = 25;  // o tipo byte armazena 8 bits
		// short idade = 25; // armazena 16 bits
		// int idade = 25;   // armazena 32 bits
		long idade = 25;     // armazena 64 bits
		
		// float altura = (float)1.68; // armazena 32 bits, uma variavel float precisa de (float) antes do valor
		double altura = 1.68; // armazena 64 bits
		
		char sexo = 'f'; // armazena 16 bits mas apenas um caractere
		
		String nome = "juliana"; // armazena uma cadeia de caracteres
		
		System.out.printf("idade = %d %n", idade);
		System.out.printf("altura = %.2f %n", altura);
		System.out.printf("sexo = %s %n", sexo);
		System.out.printf("nome = %s %n", nome);

	}

}
