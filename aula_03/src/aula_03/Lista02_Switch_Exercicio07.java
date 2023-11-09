package aula_03;

import java.util.Scanner;
public class Lista02_Switch_Exercicio07 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int idOperação;
		float num1, num2, soma,sub, mult, div;
			
		System.out.println("***Calculadora***");
		System.out.println("Digite o Primeiro valor: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o Segundo valor: ");
		num2 = leia.nextInt();
		
		System.out.println("Operadores");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("\nInforme o tipo da Operação: ");
		idOperação = leia.nextInt();
		

		switch(idOperação){
		case 1:
			soma = num1 + num2;
			System.out.printf("A Soma de %.1f e %.1f é igual a %.1f.",num1,num2,soma);
			break;
		case 2:
			sub = num1 - num2;
			System.out.printf("A Subtração entre %.1f e %.1f é igual a %.1f.",num1,num2,sub);
			break;
		case 3:
			mult = num1 * num2;
			System.out.printf("A Multiplicação de %.1f e %.1f é igual a %.1f.",num1,num2,mult);
			break;
		case 4:
			div = num1 / num2;
			System.out.printf("A Divisão entre %.1f e %.1f é igual a %.1f.",num1,num2,div);
			break;
			default:
				System.out.println("Operação invalida!");
		}
	}
}
