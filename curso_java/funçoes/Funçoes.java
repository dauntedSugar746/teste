package curso_java.funçoes;

public class Funçoes {
	
	public void print(String texto) { // cria a fun��o e se tiver static n�o precisa importar a classe
		
		System.out.println(texto); // escreve na tela o texto
		
	}

	public static void main(String[] args) {
		
		Funçoes func = new Funçoes(); // chama a classe fun��o em uma variavel
		
		func.print("ola mundo"); // essa fun��o � o System.out.println() s� que de outra forma

	}

}
