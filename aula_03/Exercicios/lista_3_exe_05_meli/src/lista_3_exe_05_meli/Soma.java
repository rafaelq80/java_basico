package lista_3_exe_05_meli;

import java.util.Scanner;

public class Soma {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		int numero = 0, soma=0;
		
		do {
			
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero > 0) 
				soma += numero;
			
		}while(numero != 0);
		
		System.out.println("\nSoma dos números positivos: " + soma);
		
	}

}
