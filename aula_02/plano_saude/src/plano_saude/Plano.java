package plano_saude;

import java.util.Scanner;

public class Plano {

	private static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nome;
		int idade;

		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a sua idade em anos: ");
		idade = leia.nextInt();

		if(idade > 0 && idade <= 10){
			System.out.println("Nome: " + nome);
			System.out.println("A mensalidade do Plano é R$ 100.00");
		}else if(idade >= 11 && idade <= 29)
			System.out.println("A mensalidade do Plano é R$ 200.00");
		else if(idade >= 30 && idade <= 45)
			System.out.println("A mensalidade do Plano é R$ 300.00");
		else if(idade >= 46 && idade <= 59)
			System.out.println("A mensalidade do Plano é R$ 500.00");
		else if(idade >= 60 && idade <= 65)
			System.out.println("A mensalidade do Plano é R$ 600.00");
		else
			System.out.println("A mensalidade do Plano é R$ 1000.00");

	}

}
