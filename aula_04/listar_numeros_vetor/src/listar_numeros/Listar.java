package listar_numeros;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Listar {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		//int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//int[] vetor = {5, 9, 1, 3, 7, 2, 8, 6, 4, 10};
		
		//Integer[] vetor = {5, 9, 1, 3, 7, 2, 8, 6, 4, 10};
		
		Integer[] vetor = new Integer[10];
		
		for (int i=0; i < vetor.length; i++){
			System.out.println("Digite o " + (i + 1) + "º numero: ");
			vetor[i] = leia.nextInt();
		}
				
		Arrays.sort(vetor);
		
		System.out.println("Numeros Pares - Ordem Crescente\n");
		
		for (int i=0; i < vetor.length; i++){
			if(vetor[i]%2 == 0)
				System.out.println("\n" + vetor[i]);
		}

		Arrays.sort(vetor, Collections.reverseOrder());
		
		System.out.println("\nNumeros Impares - Ordem Decrescente\n");
		
		for (int numero : vetor){
			if(numero%2 == 1)
				System.out.println("\n" + numero);
		}

	}

}
