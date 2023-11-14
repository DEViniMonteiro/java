package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista01_CollectionList_Exercicio02 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int num=0;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		if (numeros.contains(num)) {
			System.out.printf("O número %d está localizado na posição: %d", num, numeros.indexOf(num));
		} else {
			System.out.printf("\nO número %d não foi encontrado!", num);
		}
	}
}
