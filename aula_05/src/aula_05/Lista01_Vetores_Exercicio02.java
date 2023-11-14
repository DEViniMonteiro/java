package aula_05;

import java.util.Scanner;

public class Lista01_Vetores_Exercicio02 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int[] vetor = new int[10];
		String pares = "", impares = "";
		float media = 0, sm = 0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			vetor[i] = leia.nextInt();
			sm += vetor[i];
		}

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				pares += String.format("%d ", vetor[i]);
			}
			if (!(i % 2 == 0)) {
				impares += String.format("%d ", vetor[i]);
			}

		}

		System.out.printf("\nElementos nos indices Impares: %S", impares);
		System.out.printf("\nElementos nos indices Pares: %S", pares);

		media = (float) (sm / vetor.length);

		System.out.printf("\nSoma: %.0f", sm);
		System.out.printf("\nMédia: %.2f", media);
	}
}