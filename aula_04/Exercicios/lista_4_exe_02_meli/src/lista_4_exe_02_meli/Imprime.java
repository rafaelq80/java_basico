package lista_4_exe_02_meli;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Imprime {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.00");
		
		/**
		 * Observe que para definir um tamanho fixo para
		 * o vetor, alocamos o espaço para um primitivo do 
		 * tipo inteiro, com tamanho 10 e atribuímos ao vetor
		 */
		int[] vetor = new int[10];
		
		//As variáveis para calcular a soma e média devem ser float
		// pq senão o cálculo da média será arredondado
		float soma = 0.0f, media = 0.0f;
		
		String indiceImpares="", elementosPares="";

		/**
		 *  O Laço de Repetição percorrerá todos os índices do vetor
		 *  limitados ao tamanho do vetor, obtido através do método length
		 */
		for (int indice = 0; indice < vetor.length; indice++) {

			/**
			 *  O índice indica a posição onde o numero digitado 
			 *  será armazenado no vetor
			 */
			System.out.println("Digite o " + (indice + 1) + "º numero: ");
			vetor[indice] = leia.nextInt();

		}

		/**
		 *  Concatena os elementos armazenados nos índices ímpares
		 *  Observe que iniciamos o indice em 1 para pegar o
		 *  primeiro indice impar e na sequência incrementamos
		 *  de 2 em 2 para pegar o próximo índice ímpar.
		 */		
		for (int indice = 1; indice < vetor.length; indice += 2) {

			indiceImpares += vetor[indice] + " ";
		}

		/**
		 *  Soma todos os elementos do vetor e concatena todos os elementos pares do vetor
		 */
		for (int indice = 0; indice < vetor.length; indice++) {

			/**
			 * Calcula o módulo do elemento por 2 para saber 
			 * se o elemento é par ou ímpar.
			 */
			if (vetor[indice] % 2 == 0)
				elementosPares += vetor[indice] + " ";

			/**
			 * Soma todos os elementos independente de 
			 * ser par ou ímpar.
			 */
			soma += vetor[indice];
			
		}

		// Exibe os elementos contidos nos índices ímpares
		System.out.println("Elementos do vetor contidos em indices impares\n");
		System.out.println(indiceImpares);

		// Exibe os elementos pares
		System.out.println("\n\nElementos do vetor que são pares:\n");
		System.out.println(elementosPares);

		// Exibe a soma de todos os elementos
		System.out.println("\n\nSoma de todos Elementos do vetor é:\n");
		System.out.println(soma);

		/**
		 * Calcula a média. Observe que na divisão foi utilizado
		 * o método length para obter o tamanho do vetor
		 */
				
		media = soma / vetor.length;
		System.out.println("\n\nA Média de todos Elementos do vetor é:\n");
		System.out.println(df.format(media));

	}

}
