package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Lista02_CollectionSet_Exercicio03 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		HashSet<Integer> numeros = new HashSet<Integer>();
		int numero, i;
		
		for(i=0; i<10; i++) {
			System.out.printf("Informe o %d° número: ", (i+1));
			numero = leia.nextInt();
			numeros.add(numero);
		}
		
		System.out.println("\nListar dados do Set: ");
		Iterator<Integer> iNumeros = numeros.iterator();
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
	}
}
