package curso_java.estruturas_condicionais;

import java.util.Scanner;

public class Swtich {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("digite o dia da semana: ");
		
		int semana = teclado.nextInt();
		String dia;
		
		switch (semana) {
		
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "ter�a";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
		
		}
		
		System.out.printf("o dia da semana � %s", dia);
		
		teclado.close();

	}

}
