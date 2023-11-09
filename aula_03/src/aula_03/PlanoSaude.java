package aula_03;

import java.util.Scanner;
public class PlanoSaude {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		System.out.println("*****Plano de Saúde*****");
		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 0 && idade <= 10 ){
			System.out.printf("\nO valor do plano para o(a) Sr(a). %s, é de: R$100,00.",nome);
		}else if (idade > 10 && idade <= 29) {
			System.out.printf("\nO valor do plano para o(a) Sr(a). %s, é de: R$200,00.",nome);
		}else if(idade > 29 && idade <= 45) {
			System.out.printf("\nO valor do plano para o(a) Sr(a). %s, é de: R$300,00.",nome);
		}else if(idade > 45 && idade <= 59){
			System.out.printf("\nO valor do plano para o(a) Sr(a). %s, é de: R$500,00.",nome);
		}else if(idade > 59 && idade <= 65) {
			System.out.printf("\nO valor do plano para o(a) Sr(a). %s, é de: R$600,00.",nome);
		}else {
			System.out.printf("\nO valor do plano para o(a) Sr(a). %s, é de: R$1.000,00.",nome);
		}
	}
}
