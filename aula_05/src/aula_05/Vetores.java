package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String[] pessoas = { "Luiza", "Aline", "Vinicius", "Antonio", "Vitor", "Samara" };
		float[] notas = new float[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um valor para a posição: [" + i + "] ");
			notas[i] = leia.nextFloat();
		}
		System.out.println("\n");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posição " + i + " = " + notas[i]);
		}

		System.out.println("\nOrdem crescente:");

		Arrays.sort(pessoas); // Esse metodo ordena um array, seja esse array com numeros inteiros ou letras.
		for (int i = 0; i < 6; i++) {
			System.out.println("Posição [" + i + "] = " + pessoas[i]);
		}
		System.out.println("\nOrdem decrecente");
		for (int i = pessoas.length - 1; i >= 0; i--) {
			System.out.println("Posição [" + i + "] = " + pessoas[i]);
		}
		System.out.println("\n\n");
		
		// Ele busca dentro do array o valor informado, indicando o (nomeArray, valorQueBusco).
		System.out.println("Localize o Objeto da posição: " + Arrays.binarySearch(pessoas, "Vinicius")); 
		
		// Ele busca uma string dentro do array
		for (int i=0; i<pessoas.length; i++) {
			if (pessoas[i].equalsIgnoreCase("Aline"))
				System.out.println("\nAline está na posição: "+ i);
		}
		
		System.out.println("\n\n");
		
		for(String pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}
