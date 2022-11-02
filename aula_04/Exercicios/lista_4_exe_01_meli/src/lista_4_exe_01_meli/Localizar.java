package lista_4_exe_01_meli;

import java.util.Scanner;

public class Localizar {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero, resultado = -1;
		
		System.out.println("Digite o número que você deseja localizar: ");
		numero = leia.nextInt();
		
		for(int contador = 0; contador < vetor.length; contador ++) {
			if(vetor[contador] == numero)
				resultado = contador;
		}
		
		if(resultado != -1)
			System.out.println("\nO numero " + numero + " está localizado na posição: " + (resultado));
		else
			System.out.println("\nO numero " + numero + " não foi encontrado!");
	
	}

}
