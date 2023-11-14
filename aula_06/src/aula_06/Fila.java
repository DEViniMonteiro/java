package aula_06;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		int i=0;

		fila.add("Aline");
		fila.add("Pedro");
		fila.add("Vinicius");
		fila.add("Luiza");
		fila.add("Maria");

		System.out.println(fila);

		fila.remove();// Remove um item da fila

		System.out.println(fila);

		System.out.println(fila.peek());// Mostra quem � o primeiro da fila, mas n�o retira

		System.out.println(fila);
		
		System.out.println(fila.poll());// Mostra quem � o primeiro da fila, e retira da fila.

		System.out.println(fila);
		
		System.out.println("A Maria esta na fila? " + fila.contains("Maria"));
		System.out.println("Numero de elementos na fila: " + fila.size());
		
		for(var pessoa:fila) {
			i++;
			if(pessoa.equalsIgnoreCase("Maria")) {
				System.out.println("Posi��o: " + i);
			}
		}
	}
}
