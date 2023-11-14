package aula_05;

import java.util.Scanner;

public class Lista02_Matrizes_Exercicio03 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int [][] matriz = new int[3][3];
		int somaP =0, somaS=0;
		String diagonalP="", diagonalS ="";

		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.println("Digite o numero da posição: ("+i+","+j+"): " );
				matriz[i][j] = leia.nextInt();
			}
		}
		
		//Diagonal Principal
		for(int t =0; t< matriz.length; t++) {
			diagonalP += matriz[t][t];
			somaP += matriz[t][t];
		}
		
		//Diagonal Principal
				for(int o =0; o< matriz.length; o++) {
					diagonalS += matriz[o][matriz.length -1 - o]+ "";
					somaS += matriz[o][o];
				}
		System.out.println("Elementos da Diagonal Principal: " + diagonalP);
		System.out.println("Elementos da Diagonal Secundaria: " + diagonalS);
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaP);
		System.out.println("Soma dos Elementos da Diagonal Secundaria: " + somaS);
	}

}
