package calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		int numero1, numero2;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextInt();
		
		System.out.println("\n" + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		System.out.println("\n" + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
		System.out.println("\n" + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
		
		if(numero2 >= 0)
			System.out.println("\n" + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
		else
			System.out.println("\nOperação Inválida! Não existe divisão por zero!");
		
		System.out.println("\n" + numero1 + " ^ " + numero2 + " = " + Math.pow(numero1, numero2));
		System.out.println("\nRaíz quadrada de " + numero1 + " = " + df.format(Math.sqrt(numero1)));
	}

}
