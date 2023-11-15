package aula_06;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade01_Fila {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		Iterator<String> iterator = fila.iterator();
		String nome;
		int opcao;

		do {
			System.out.println("\n***********************************");
			System.out.println("									 ");
			System.out.println("	1 - Adicionar Cliente na Fila 	 ");
			System.out.println("	2 - Listar todos os Clientes	 ");
			System.out.println("	3 - Retirar Cliente da Fila		 ");
			System.out.println("	0 - Sair						 ");
			System.out.println("									 ");
			System.out.println("*************************************");
			System.out.print("\nDigite uma op��o: ");
			opcao = leia.nextInt();
			leia.skip("\\R");

			switch (opcao) {
			case 1: {
				System.out.print("\nDigite o nome: ");
				nome = leia.nextLine();
				fila.add(nome);

				System.out.println("\nFila:\n");
				iterator = fila.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				System.out.println("\nCliente Adicionado!");
				break;
			}
			case 2: {
				if (fila.isEmpty()) {
					System.out.println("\nA Fila est� vazia!");
					break;
				}
				System.out.println("\nLista de Clientes na Fila:\n");
				iterator = fila.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				break;
			}
			case 3: {
				if (fila.isEmpty()) {
					System.out.println("\nA Fila est� vazia!");
					break;
				}
				fila.poll();
				
				System.out.println("\nFila:\n");
				iterator = fila.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				System.out.println("\nO cliente foi Chamado!");
				break;
			}
			case 0: {
				System.out.println("\nPrograma Finalizado!");
				break;
			}
			default:
				System.out.println("\nOp��o inv�lida!");
				break;
			}
		} while (opcao != 0);
	}
}
