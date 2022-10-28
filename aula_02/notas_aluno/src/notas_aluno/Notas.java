package notas_aluno;

import java.util.Scanner;

public class Notas {

	private static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float nota1, nota2, media;

		System.out.println("Digite a primeira nota\n");
		nota1 = leia.nextFloat();

		System.out.println("Digite a segunda nota\n");
		nota2 = leia.nextFloat();

		media = (nota1 + nota2) / 2;

			System.out.println((media >= 6) ? "Aprovade!\n" : "Reprovade!\n");

	}

}
