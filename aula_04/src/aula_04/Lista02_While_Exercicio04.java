package aula_04;

import java.util.Scanner;
class Lista02_While_Exercicio04 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade, idGenero, idDev, i=0, b=0, mtf=0, htm40=0, nf30=0, sIdade=0;
		float  mediaIdade=0.00f;	
		String cont = "S";

		while (cont.equalsIgnoreCase("S")) {
			System.out.println("**Cadastro de Funcionario**");
			System.out.println("\nDigite a idade: ");
			idade = leia.nextInt();

			System.out.println("Identidade de Gênero");
			System.out.println(" 1 - Mulher Cis");
			System.out.println(" 2 - Homem Cis");
			System.out.println(" 3 - Não Binário");
			System.out.println(" 4 - Mulher Trans");
			System.out.println(" 5 - Homem Trans");
			System.out.println(" 6 - Outros");
			System.out.println("\nInforme o Gênero: ");
			idGenero = leia.nextInt();

			System.out.println("Pessoa Desenvolvedora");
			System.out.println(" 1 - Backend");
			System.out.println(" 2 - Frontend");
			System.out.println(" 3 - Mobile");
			System.out.println(" 4 - FullStack");
			System.out.println("\nInforme a Especialidade: ");
			idDev = leia.nextInt();
			
			if (idDev == 1) {//Backend
				b++;
			} else if (idGenero == 1 && idDev == 2 || idGenero == 4 && idDev == 2) {//Mulher Cis e Trans Frontend
				mtf++;
			} else if (idGenero == 2 && idDev == 3 && idade <= 40 || idGenero == 5 && idDev == 3 && idade <= 40) {// Homen Cis e Trans Mobile +40
				htm40++;
			} else if (idGenero == 3 && idDev == 4 && idade < 30) {//Não Binaria FullStack -30
				nf30++;
			}
			
			i++; // Total de Pessoas
			
			sIdade += idade;
			mediaIdade = sIdade/i; // Media idade
			
			System.out.println("Deseja continuar (S/N): ");
			leia.skip("\\R");
			cont = leia.nextLine().toUpperCase();
		}
		System.out.println("\n\n***Estatisticas:***");
		System.out.println("\nTotal de pessoas Desenvolvedoras Backend: " + b);
		System.out.println("Total de Mulheres Cis e Trans Desenvolvedoras Frontend: " + mtf);
		System.out.println("Total de Homens Cis e Trans Desenvolvedores Mobile maiores de 40 anos: " + htm40);
		System.out.println("Total de Pessoas Não Binárias Desenvolvedoras FullStack menores de 30 anos: " + nf30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + i);
		System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdade);

	}

}
