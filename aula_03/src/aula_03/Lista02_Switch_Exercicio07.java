package aula_03;

import java.util.Scanner;
public class Lista02_Switch_Exercicio07 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int idOpera��o;
		float num1, num2, soma,sub, mult, div;
			
		System.out.println("***Calculadora***");
		System.out.println("Digite o Primeiro valor: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o Segundo valor: ");
		num2 = leia.nextInt();
		
		System.out.println("Operadores");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		System.out.println("\nInforme o tipo da Opera��o: ");
		idOpera��o = leia.nextInt();
		

		switch(idOpera��o){
		case 1:
			soma = num1 + num2;
			System.out.printf("A Soma de %.1f e %.1f � igual a %.1f.",num1,num2,soma);
			break;
		case 2:
			sub = num1 - num2;
			System.out.printf("A Subtra��o entre %.1f e %.1f � igual a %.1f.",num1,num2,sub);
			break;
		case 3:
			mult = num1 * num2;
			System.out.printf("A Multiplica��o de %.1f e %.1f � igual a %.1f.",num1,num2,mult);
			break;
		case 4:
			div = num1 / num2;
			System.out.printf("A Divis�o entre %.1f e %.1f � igual a %.1f.",num1,num2,div);
			break;
			default:
				System.out.println("Opera��o invalida!");
		}
	}
}
