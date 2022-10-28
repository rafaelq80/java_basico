package reajuste_salarial;

import java.util.Scanner;

public class Reajuste {

	private static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int cargo;
		float salarioAtual, reajuste;

		System.out.println("Informe o cargo do funcionario:");
		cargo = leia.nextInt();

		System.out.println("\nInforme o salario atual:");
		salarioAtual = leia.nextFloat();

		switch (cargo) {
		case 1:
			reajuste = (salarioAtual * 7) / 100;
			break;
		case 2:
			reajuste = (salarioAtual * 9) / 100;
			break;
		case 3:
			reajuste = (salarioAtual * 5) / 100;
			break;
		default:
			reajuste = (salarioAtual * 12) / 100;
		}

		System.out.println("\nO reajuste é de R$: " + reajuste);
		System.out.println("\nO novo salário é de R$: " + (salarioAtual + reajuste));

	}

}
