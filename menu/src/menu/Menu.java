package menu;

import java.util.Scanner;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_GREEN
					+ "*********************************************************************" + Cores.TEXT_RESET);
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND
					+ "                                                                     ");
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND
					+ "                       BANCO DO BRAZIL COM Z                         ");
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND
					+ "                                                                     ");
			System.out.println(Cores.TEXT_RESET + Cores.TEXT_GREEN
					+ "*********************************************************************");
			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLUE_BACKGROUND
					+ "                                                                     ");
			System.out.println(
					Cores.TEXT_GREEN_BOLD + "            1 - Criar Conta                                          ");
			System.out.println(
					Cores.TEXT_GREEN_BOLD + "            2 - Ver Saldo da Conta                                   ");
			System.out.println(
					Cores.TEXT_GREEN_BOLD + "            3 - Dados da Conta                                       ");
			System.out.println(
					Cores.TEXT_GREEN_BOLD + "            4 - Sacar                                                ");
			System.out.println(
					Cores.TEXT_GREEN_BOLD + "            5 - Depositar em Conta Corrente                          ");
			System.out.println(
					Cores.TEXT_GREEN_BOLD + "            6 - Transferir entre Contas Corrente                     ");
			System.out.println(
					Cores.TEXT_GREEN_BOLD + "            7 - Sair                                                 ");
			System.out.println(Cores.TEXT_GREEN_BOLD
					+ "                                                                     " + Cores.TEXT_RESET);
			System.out.println(
					Cores.TEXT_GREEN + "*********************************************************************");
			System.out.println(
					Cores.TEXT_YELLOW + " Entre com a opção desejada:                         " + Cores.TEXT_RESET);
			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco Brazil com Z - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta Corrente\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Visualizar Saldo\n\n");

				break;
			case 3:

				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Depositar\n\n");

				break;
			case 6:

				System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");

				break;
			default:

				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!");

				break;
			}
		}

	}

}
