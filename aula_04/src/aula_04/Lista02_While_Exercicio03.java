package aula_04;

import java.util.Scanner;
public class Lista02_While_Exercicio03 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int idade = 0, menor = 0, maior = 0;

		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
				if (idade > 0 && idade < 21) {
					menor++;
				} else if (idade > 50) {
					maior++;
				} else if (idade < 0) {
					System.out.println("Total de pessoas menores de 21 anos: " + menor);
					System.out.println("Total de pessoas maiores de 50 anos: " + maior);
				}
		}
	}
}