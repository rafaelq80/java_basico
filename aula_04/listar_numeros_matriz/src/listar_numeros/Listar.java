package listar_numeros;

import java.util.Scanner;

public class Listar {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		for (int indiceI = 0; indiceI < matriz.length; indiceI ++){
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ ++){
				
				System.out.println("Digite o numero da posição (" + indiceI + "," + indiceJ + "): ");
				matriz[indiceI][indiceJ] = leia.nextInt();
				
			}
		}
		
		System.out.println("\nExibir em Ordem Atual\n");
		
		for (int[] vetor : matriz) {
		    for (int elemento : vetor) {
		    	System.out.println("\n" + elemento);
			}
		}
		
		System.out.println("\nExibir em Ordem Inversa\n");
		
		for (int indiceI = matriz.length - 1; indiceI >= 0; indiceI --){
			for (int indiceJ = matriz.length - 1; indiceJ >= 0; indiceJ --){
				System.out.println("\n" + matriz[indiceI][indiceJ]);
			}
		}
		
		System.out.println("\nNumeros Pares\n");
		
		for (int indiceI = 0; indiceI < matriz.length; indiceI ++){
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ ++){
				if(matriz[indiceI][indiceJ]%2 == 0)
					System.out.println("\n" + matriz[indiceI][indiceJ]);
			}
		}

		System.out.println("\nNumeros Impares\n");
		
		// Percorre a linha da Matriz
		for (int[] vetor : matriz) {
			// Percorre os elementos da coluna da Matriz
		    for (int elemento : vetor) {
		    	if(elemento%2 == 1)
					System.out.println("\n" + elemento);
			}
		}

	}

}
