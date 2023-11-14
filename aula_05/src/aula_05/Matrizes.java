package aula_05;

import java.util.Scanner;

public class Matrizes {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		double[][] matrizDouble = new double[3][3];
		int [][] matrizIrregular = {{1,2,3},{4,5,6}};

		// Matriz com dados pré-definidos
		// Controlar as Linhas (Eixo X)
		for (int i = 0; i < matriz.length; i++) {
			// Controlar as Colunas (Eixo Y)
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("Matriz [" + i + "] " + "[" + j + "] = " + matriz[i][j]);
			}
		}

		System.out.println("\n");
		// Matriz com dados sem dados.
		for (int i = 0; i < matrizDouble.length; i++) {
			for (int j = 0; j < matrizDouble.length; j++) {
				System.out.println("Matriz Double [" + i + "] " + "[" + j + "] = ");
				matrizDouble[i][j] = leia.nextDouble();
			}
		}
		for (int i = 0; i < matrizDouble.length; i++) {
			for (int j = 0; j < matrizDouble.length; j++) {
				System.out.println("Matriz Double [" + i + "] " + "[" + j + "] = " + matrizDouble[i][j]);
			}
		}
		System.out.println("\n\n");
		
		
		//Matriz Irregular
		for (int i = 0; i < matrizIrregular.length; i++) {
			for (int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.println("Matriz Irregular [" + i + "] " + "[" + j + "] = " + matrizIrregular[i][j]);
			}
		}	
	}
}
