package pesquisa;

import java.util.Scanner;

public class Pesquisa {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		
		int idade, sexo, esporte, futebol = 0, voleibol = 0, basquetebol = 0, futebolVolei = 0;
		String continua = "S";

		while (continua.equals("S")) {

			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();

			do {
				System.out.println("Digite o sexo (1-M/2-F/3-Outros): ");
				sexo = leia.nextInt();
				
				if(sexo < 1 || sexo > 3)
					System.out.println("Digite um número entre 1 e 3");
				
			}while(sexo < 1 || sexo > 3);
			
			do {
				System.out.println("Digite o seu esporte favorito (1-Fut/2-Vol/3-Basq/4-outros): ");
				esporte = leia.nextInt();
				
				if(esporte < 1 || esporte > 4)
					System.out.println("Digite um número entre 1 e 4");
				
			}while(esporte < 1 || esporte > 4);
			
			if (esporte == 1)
				futebol++;

			if (esporte == 2 && sexo == 2)
				voleibol++;

			if (esporte == 3 && sexo == 1 && idade > 50)
				basquetebol++;

			if ((esporte == 1 || esporte == 2) && idade > 18)
				futebolVolei++;

			System.out.println("Deseja continuar(S/N)? ");
			leia.skip("\\R?");
			continua = leia.nextLine().toUpperCase();
			
		}

		System.out.println("\nTotal de pessoas que gostam de Futebol: " + futebol);
		System.out.println("\nTotal de pessoas do sexo Feminino que gostam de Voleibol: " + voleibol);
		System.out.println("\nTotal de pessoas do sexo Masculino, maiores de 50 anos e que gostam de Basquetebol: " + basquetebol);
		System.out.println("\nTotal de pessoas que gostam de Futebol ou Voleibol e são maiores de 18 anos: " + futebolVolei);
	}

}
