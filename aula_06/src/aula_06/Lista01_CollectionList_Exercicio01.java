package aula_06;

import java.util.ArrayList;
import java.util.Scanner;
public class Lista01_CollectionList_Exercicio01 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i =0; i<5; i++) {
			System.out.printf("Informe a %d cor: ", (i+1));
			String cor = leia.next();
			cores.add(cor);
		}
		System.out.println("\nLista de Cores: ");
		for(var cor : cores) {
			System.out.println(cor);
		}
		
		System.out.println("\nCores Ordenadas: ");
		cores.sort(null);
		for(var cor : cores) {
			System.out.println(cor);
		}
	}
}
