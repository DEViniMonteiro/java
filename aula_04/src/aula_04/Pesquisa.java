package aula_04;

import java.util.Scanner;
public class Pesquisa {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int idade, esporte, fut=0, voleiM18=0,basqMen18 = 0, outros = 0;
		String continua = "S";

		while(continua.equalsIgnoreCase("S")) {
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do{
				System.out.println("Digite seu Esporte Favorito (1 - Fut/ 2-Vol / 3-Basq / 4-Outros: ");
				esporte = leia.nextInt();
				
				if(esporte < 1 || esporte > 4) {
					System.out.println("Digite um numero entre 1 e 4.");
				}
			}while (esporte < 1 || esporte > 4);
			
			//Quantas pessoas gostam de futebol
			if(esporte ==1 && idade >= 18) {
				fut++;
			}
			
			//Quantas pessoas gostam de Volei e São maiores de 18 anos
			if(esporte ==2) {
				voleiM18++;
			}
			// Quantas pessoas gostam de Basquete e São menores de 18 anos
			if(esporte ==3) {
				basqMen18++;
			}
			//Quantas pessoas gostam de Outros esportes.
			if(esporte ==4) {
				outros++;
			}
			System.out.println("Deseja continuar? (S/N)");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();// '.toUpperCase()' converte letra minuscula para maiuscula. 
		}
		System.out.println("\n***Estatisticas***");
		System.out.println("Total de Pessoas que gostam de Futebol: " + fut);
		System.out.println("Total de Pessoas que gostam de Voleibol e são Maiores de 18 anos: " + voleiM18);
		System.out.println("Total de Pessoas que gostam de Basquete e são Maiores de 18 anos: " + basqMen18);
		System.out.println("Total de Pessoas que gostam de Outros esportes: " + outros);
	}
}
