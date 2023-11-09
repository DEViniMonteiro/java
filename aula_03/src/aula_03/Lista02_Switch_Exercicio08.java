package aula_03;

import java.util.Scanner;
public class Lista02_Switch_Exercicio08 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idOperacao;
		float saldo = 1000, saque, deposito, operador;

		System.out.println("***Conta Bancaria***");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		System.out.println("\nInforme a Operação:");
		idOperacao = leia.nextInt();

		switch (idOperacao) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f", saldo);
			break;
		case 2:
			System.out.println("\nInforme o valor do saque: ");
			saque = leia.nextFloat();
			operador = saldo - saque;

			if (saque > saldo) {
				System.out.println("\nOperação - Saque");
				System.out.println("Saldo Insuficient!");
			} else {
				System.out.println("\nOperação - Saque");
				System.out.printf("Novo saldo: R$ %.2f", operador);
			}
			break;
		case 3:
			System.out.println("\nInforme o valor do Depósito: ");
			deposito = leia.nextFloat();
			operador = saldo + deposito;

			System.out.println("\nOperação - Depósito");
			System.out.printf("Novo saldo: R$ %.2f", operador);
			break;
		default:
			System.out.println("Operação Inválida!");
		}
	}
}
