package lista_4_exe_04_meli;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Medias {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float[][] matriz = new float[10][4];
		float[] media = new float[10];
		float soma = 0.0f;
		int tamanhoI = 0, tamanhoJ = 0;
		DecimalFormat df = new DecimalFormat("#.0");
		
		if (matriz.length > 0)
		{
			tamanhoI = matriz.length;
			tamanhoJ = matriz[0].length;            
		}
		 
		for (int indiceI = 0; indiceI < tamanhoI; indiceI++) {

			for (int indiceJ = 0; indiceJ < tamanhoJ; indiceJ++) {

				System.out.println("Digite a " + (indiceJ + 1) + "º nota do participante " + (indiceI + 1) + ": ");
				matriz[indiceI][indiceJ] = leia.nextFloat();

			}

		}

		for (int indiceI = 0; indiceI < tamanhoI; indiceI++) {

			for (int indiceJ = 0; indiceJ < tamanhoJ; indiceJ++) {

				soma += matriz[indiceI][indiceJ];

			}

			media[indiceI] = soma / tamanhoJ;
			soma = 0.0f;

		}

		for (int indiceI = 0; indiceI < media.length; indiceI++) {

			System.out.println("\nMédia do participante " + (indiceI + 1) + ": " + df.format(media[indiceI]));

		}

	}

}
