package lista_3_exe_02_meli;

import java.util.Scanner;

public class ParesImpares {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		int numero, pares=0, impares=0;
		
		for(int contador = 0;contador < 10; contador ++) {
			
			System.out.println("Digite o " + (contador+1) + "º número: ");
			numero = leia.nextInt();
			
			if(numero%2 == 0) 
				pares ++;
			else
				impares ++;
		}
		
		System.out.println("\nTotal de números pares: " + pares);
		System.out.println("\nTotal de números ímpares: " + impares);
		
	}

}
