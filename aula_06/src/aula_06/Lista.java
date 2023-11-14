package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Double> notas = new ArrayList<Double>();
		double numero;

		System.out.println("");
		numero = leia.nextDouble();
		notas.add(numero);

		notas.add(7.0);
		notas.add(4.0);
		notas.add(6.0);
		notas.add(7.0);
		notas.add(9.0);

		for (var nota : notas) {
			System.out.println(nota);

		}
		System.out.println(notas);
		System.out.println("Posição do elemento 7: " + notas.indexOf(7.0));// lastIndexOf: Se existir valores/dados
																			// repetidos, esse metodo ira apontar o
																			// ultimo valor. 
																			//indexOf: Se existir valores/dados repetidos, esse metodo
																			// aponta para o primeiro valor.
		System.out.println("Existe o elemento 7? " + notas.contains(7.0));
		System.out.println("Me mostra o valor da posição 0: " + notas.get(0));
		notas.remove(3); // Metodo que remove o item indicado entre parenteses.
		System.out.println(notas);

		notas.forEach(System.out::println); // Funciona quando queremos mostrar todo numero de uma vez, caso queira
											// realizar algum processamento, ai é preciso utilizar o For convencional.
		notas.clear();// Metodo que remove todos os itens do objeto.
		System.out.println("A Lista esta vazia? " + notas.isEmpty()); // Metodo que Verifica se a lista esta vazia.
	}
}
