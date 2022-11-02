package lista_3_exe_03_meli;

import java.util.Scanner;

public class Pessoas {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		int idade=0, menoresVinteUm=0, maioresCinquenta=0;
		
		while(idade >= 0 ) {
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0) 
				menoresVinteUm ++;

			if(idade > 50) 
				maioresCinquenta ++;
			
		}
		
		System.out.println("\nTotal de números pares: " + menoresVinteUm);
		System.out.println("\nTotal de números ímpares: " + maioresCinquenta);
		
	}

}
