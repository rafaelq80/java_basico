package lista_4_exe_03_meli;

import java.util.Scanner;

public class Diagonais {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
		String diagonalPrincipal = "", diagonalSecundaria = "";

		// O primeiro Laço de Repetição percorrerá as linhas da Matriz
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			// O segundo Laço de Repetição percorrerá as colunas da Matriz
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {

				// A combinação Linha e Coluna indica a posição onde o numero
				// digitado será armazenado
				System.out.println("Digite o numero da posição: (" + indiceI + "," + indiceJ + "): ");
				matriz[indiceI][indiceJ] = leia.nextInt();

			}

		}

		// Listar e somar os elementos da Diagonal Principal
		// Na Diagonal principal os índices dos elementos são iguais
		// Exemplo: 0,0
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			diagonalPrincipal += matriz[indiceI][indiceI] + " ";
			somaPrincipal += matriz[indiceI][indiceI];

		}

		// Listar e somar os elementos da Diagonal Secundária
		// Na Diagonal secundária o índice da coluna é o resultado entre o
		// tamanho da linha - 1 - indice da linha
		// Exemplo: 2,0 => tamanho da linha (3) - 1 - indice da linha (2)
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			diagonalSecundaria += matriz[indiceI][matriz.length - 1 - indiceI] + " ";
			somaSecundaria += matriz[indiceI][matriz.length - 1 - indiceI];

		}

		// Exibe os elementos de cada Diagonal e a Soma dos elementos

		System.out.println("Elementos da Diagonal Principal:\n");
		System.out.println(diagonalPrincipal);

		System.out.println("\n\nElementos da Diagonal Secundária:\n");
		System.out.println(diagonalSecundaria);

		System.out.println("\n\nSoma de todos Elementos da Diagonal Principal:\n");
		System.out.println(somaPrincipal);

		System.out.println("\n\nA Média de todos Elementos da Diagonal Secundária:\n");
		System.out.println(somaSecundaria);

	}

}
