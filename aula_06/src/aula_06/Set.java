package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Set {
	public static void main(String[] args) {
		HashSet<String> frutas = new HashSet<String>();

		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Jaboticaba");
		frutas.add("Kiwi");

		System.out.println(frutas);

		for (var fruta : frutas) {
			System.out.println(fruta.hashCode());// Metodo para exibir os HasCodes de cada letra.
		}

		System.out.println("A fruta Morango exsite: " + frutas.contains("Morango"));
		frutas.remove("Morango");
		System.out.println(frutas);

		System.out.println("\n");
		//Serve para percorrer uma Colection
		Iterator<String> iFrutas = frutas.iterator();
		while (iFrutas.hasNext()) {
			System.out.println(iFrutas.next());
		}

		// Criamos ArrayList
		System.out.println("\n");
		ArrayList<String> frutaList = new ArrayList<String>();

		frutaList.addAll(frutas);// Adiciona todos os dados da coleção HashSet array "frutas" no novo array "frutaList".
		frutaList.sort(null);// Ordenamos os elementos em ordem crescente
		System.out.println(frutaList);

		frutaList.sort(Comparator.reverseOrder());// Ordenamos em ordem decrescente
													// Só é possivel ordernar a Lista em ordem decrescente se a lista
													// estiver devidamente ordenada(Crescente).

		System.out.println(frutaList);
	}
}
