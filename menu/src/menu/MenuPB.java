package menu;

import java.util.Scanner;

public class MenuPB {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;

		while (true) {

			// 70 *
			System.out.println("**********************************************************************");
			System.out.println("                                                                      ");
			System.out.println("                       BANCO DO BRAZIL COM Z                          ");
			System.out.println("                                                                      ");
			System.out.println("**********************************************************************");
			System.out.println("                                                                      ");
			System.out.println("            1 - Criar Conta                                           ");
			System.out.println("            2 - Ver Saldo da Conta                                    ");
			System.out.println("            3 - Dados da Conta                                        ");
			System.out.println("            4 - Sacar                                                 ");
			System.out.println("            5 - Depositar em Conta Corrente                           ");
			System.out.println("            6 - Transferir entre Contas Corrente                      ");
			System.out.println("            7 - Sair                                                  ");
			System.out.println("                                                                      ");
			System.out.println("**********************************************************************");
			System.out.println(" Entre com a opção desejada:                                          ");
			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println("\nBanco Brazil com Z - O seu Futuro começa aqui!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta Corrente\n\n");

				break;
			case 2:
				System.out.println("Visualizar Saldo\n\n");

				break;
			case 3:

				System.out.println("Consultar dados da Conta\n\n");

				break;
			case 4:
				System.out.println("Saque\n\n");

				break;
			case 5:
				System.out.println("Depositar\n\n");

				break;
			case 6:

				System.out.println("Transferência entre Contas\n\n");

				break;
			default:

				System.out.println("\nOpção Inválida!");

				break;
			}
		}

	}

}
