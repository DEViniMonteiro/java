package aula_06;

import java.util.HashSet;
import java.util.Scanner;

public class Lista02_CollectionSet_Exercicio04 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		HashSet<Integer> numeros = new HashSet<Integer>();
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

		System.out.println(numeros);

		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		if(numeros.contains(num)) {
			System.out.println("O número " + num + " foi encontrado!");
		}else {
			System.out.println("O número " + num + " não foi encontrado!");
		}	
	}
}
