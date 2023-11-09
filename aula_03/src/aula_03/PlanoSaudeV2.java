package aula_03;

import java.util.Scanner;

public class PlanoSaudeV2 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int faixaIdade;
		String nome;
		
		System.out.println("*****Plano de Sa�de*****");
		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.printf("\nBom dia Sr(a) %s, Favor informar sua Faixa Et�ria: ", nome);
		
		System.out.println("\n \n***Faixa Et�rias** ");
		System.out.println("1 - De: 0 a 10 Anos ");
		System.out.println("2 - De: 11 a 29 Anos ");
		System.out.println("3 - De: 30 a 45 Anos ");
		System.out.println("4 - De: 46 a 59 Anos ");
		System.out.println("5 - De: 60 a 65 Anos ");
		System.out.println("6 - Acima de 66 Anos ");
		
		System.out.print("Digite a faixa et�ria: ");
		faixaIdade = leia.nextInt();

		
		
		switch(faixaIdade) {
		case 1:
			System.out.printf("\nO valor do plano para o(a) Sr(a). %s, � de: R$100,00.",nome);
			break;
		case 2:
			System.out.printf("\nO valor do plano para o(a) Sr(a). %s, � de: R$200,00.",nome);
			break;
		case 3:
			System.out.printf("\nO valor do plano para o(a) Sr(a). %s, � de: R$300,00.",nome);
			break;
		case 4:
			System.out.printf("\nO valor do plano para o(a) Sr(a). %s, � de: R$500,00.",nome);
			break;
		case 5:
			System.out.printf("\nO valor do plano para o(a) Sr(a). %s, � de: R$600,00.",nome);
			break;
		case 6:
			System.out.printf("\nO valor do plano para o(a) Sr(a). %s, � de: R$1000,00.",nome);
		default:
			System.out.println("Faixa et�ria invalida !!!");
		}
	}
}
