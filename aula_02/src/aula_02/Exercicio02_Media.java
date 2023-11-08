package aula_02;

import java.util.Scanner;
public class Exercicio02_Media {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Calculo Média \n");
		
		System.out.println("Digite a Primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a Segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a Terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a Quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/ 4;
		System.out.println("Média Final é: " + media);
	}
}
