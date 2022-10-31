package tabuada_for;

import java.util.Scanner;

public class Tabuada {

	private static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero; 
		boolean ok = false;

		do {

			System.out.println("Digite a Tabuada que você deseja calcular: \n");
			numero = leia.nextInt();

			if (numero < 1 || numero > 10)
				System.out.println("\nDigite um número inteiro entre 1 e 10\n\n");
			else
				ok = true;

		} while (ok == false);

		for (int contador = 1; contador <= 10 ; contador ++) {

			System.out.println("\n" + numero + " x " + contador + " = " + (numero * contador));

		}
		
	}

}
