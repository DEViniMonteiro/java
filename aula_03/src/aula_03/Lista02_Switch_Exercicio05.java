package aula_03;

import java.util.Scanner;
public class Lista02_Switch_Exercicio05 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int codigo, quantidade;
		float  precoTotal, p1=10, p2=15, p3=18, p4=12, p5=8, p6=13;
		
		System.out.println("***Cardápio***");
		System.out.println("1 - Cachorro Quente.");
		System.out.println("2 - X-Salda.");
		System.out.println("3 - X-Bacon.");
		System.out.println("4 - Bauru.");
		System.out.println("5 - Refrigerante.");
		System.out.println("6 - Suco de laranja.");
		
		System.out.print("\nInforme seu pedido: ");
		codigo = leia.nextInt();
		
		System.out.print("Informe a quantidade: ");
		quantidade = leia.nextInt();
		
		
		
		switch(codigo) {
		case 1:
			precoTotal = quantidade*p1;
			System.out.println("Produto: Cachorro Quente");
			System.out.printf("Valor Total: R$%.2f ", precoTotal);
			System.out.println("\nObrigado pela preferencia, volte sempre!!");
			break;
		case 2:
			precoTotal = quantidade*p2;
			System.out.println("Produto: X-Salada");
			System.out.printf("Valor Total: R$%.2f ", precoTotal);
			System.out.println("\nObrigado pela preferencia, volte sempre!!");
			break;
		case 3:
			precoTotal = quantidade*p3;
			System.out.println("Produto: X-Bacon");
			System.out.printf("Valor Total: R$%.2f ", precoTotal);
			System.out.println("\nObrigado pela preferencia, volte sempre!!");
			break;
		case 4:
			precoTotal = quantidade*p4;
			System.out.println("Produto: Bauru");
			System.out.printf("Valor Total: R$%.2f ", precoTotal);
			System.out.println("\nObrigado pela preferencia, volte sempre!!");
			break;
		case 5:
			precoTotal = quantidade*p5;
			System.out.println("Produto: Refrigerante");
			System.out.printf("Valor Total: R$%.2f ", precoTotal);
			System.out.println("\nObrigado pela preferencia, volte sempre!!");
			break;
		case 6:
			precoTotal = quantidade*p6;
			System.out.println("Suco de Laranja");
			System.out.printf("Valor Total: R$%.2f ", precoTotal);
			System.out.println("\nObrigado pela preferencia, volte sempre!!");
			break;
		default:
			System.out.println("Codigo Invalido.");
		}
		
	}
}
