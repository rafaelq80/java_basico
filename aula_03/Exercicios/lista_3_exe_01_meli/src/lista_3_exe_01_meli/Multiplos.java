package lista_3_exe_01_meli;

import java.util.Scanner;

public class Multiplos {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numeroInicial, numeroFinal;
				
		System.out.println("Informe o início do intervalo: ");
		numeroInicial = leia.nextInt();
		
		System.out.println("Informe o final do intervalo: ");
		numeroFinal = leia.nextInt();
		
		if(numeroInicial > numeroFinal) {
			System.out.println("Intervalo inválido!");
			System.exit(0);
		}
		
		for(int contador = numeroInicial;contador <= numeroFinal; contador ++) {
			
			if(contador%3 == 0 && contador%5 == 0) 
				System.out.println(contador + " é múltiplo de 5 e 3");
		}

	}

}
