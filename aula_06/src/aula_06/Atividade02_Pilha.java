package aula_06;

import java.util.Scanner;
import java.util.Stack;

public class Atividade02_Pilha {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		int opcao;
		String nLivro;
		
		
		System.out.println("********************************************************");
		System.out.println("														");
		System.out.println("		1 - Adicionar Livro na Pilha 					");
		System.out.println("		2 - Listar todos os Livros						");
		System.out.println("		3 - Retirar Livro da Pilha						");
		System.out.println("		0 - Sair										");
		System.out.println("														");
		System.out.println("********************************************************");
		System.out.println("Entre com a Opção desejada:								");
		opcao = leia.nextInt();

		while (opcao == 0) {
			System.out.println("\nPrograma Finalizado: ");
			System.exit(0);
			
			switch(opcao) {
			case 1:
				System.out.println("Informe o Nome do Livro");
				leia.skip("\\R");
				nLivro = leia.nextLine();;
				pilha.add(nLivro);
				System.out.println("Livro: "+ nLivro+ " Adicionado!");
				break;
			case 2:
				if(pilha.empty()) {
					System.out.println("A pilha está vazia!");
				}else {
					String livro = pilha.pop();
					System.out.println("Pilha: "+ pilha);
				}
	}
		}
		
		
	}
}
