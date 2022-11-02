package lista_3_exe_04_meli;

import java.util.Scanner;

public class Pesquisa {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, sexo, categoria, back = 0, front = 0, mobile = 0, full = 0;
		String continua = "S";

		while (continua.equals("S")) {

			System.out.println("Digite a idade: ");
			idade = leia.nextInt();

			System.out.println("Digite o sexo (1-M/2-F/3-Outros): ");
			sexo = leia.nextInt();

			// Validação do sexo
			while (sexo < 1 || sexo > 3) {
				System.out.println("Digite o sexo (1-M/2-F/3-Outros): ");
				sexo = leia.nextInt();
			}

			System.out.println("Digite a categoria..");
			System.out.println("(1-Back/2-Front/3-Mobile/4-Full): ");
			categoria = leia.nextInt();

			//Validação da categoria
			while (categoria < 1 || categoria > 4) {
				System.out.println("Digite a categoria..");
				System.out.println("(1-Back/2-Front/3-Mobile/4-Full): ");
				categoria = leia.nextInt();
			}

			if (categoria == 1)
				back++;

			if (categoria == 2 && sexo == 2)
				front++;

			if (categoria == 3 && sexo == 1 && idade > 40)
				mobile++;

			if (categoria == 4 && idade < 30)
				full++;

			System.out.println("Deseja Continuar (S/N)?");
			
			/**
			 * "Pula" o separador de linha do println \n e retorna
			 * o cursor para o começo da linha \r
			 * 
			 * Quando você está pedindo ao usuário para digitar a
			 * categoria, o usuário digita 1 e pressiona enter, a 
			 * entrada padrão conterá "42\r\n". 
			 * 
			 * Ao solicitar a leitura de uma String, o comando 
			 * nextLine() lerá os caracteres \r\n, gerando uma 
			 * String vazia, que finalizará o programa.
			 * 
			 * O comando leia.skip("\\R?"); o Scanner irá "pular" 
			 * os caracteres \r\n e irá preparar o System.in 
			 * para ler uma String em uma nova linha sem o \r\n.
			 */ 
			leia.skip("\\R?");
			continua = leia.nextLine().toUpperCase();

		}

		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + back);
		System.out.println("\nTotal de mulheres desenvolvedoras Frontend: " + front);
		System.out.println("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: " + mobile);
		System.out.println("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: " + full);

	}

}
