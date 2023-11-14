package aula_05;

import java.util.Scanner;
public class Lista02_Matrizes_Exercicio04 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		float [][] notas= new float [10][4];
		float [] medias= new float [10];
		float soma = 0.0f;
		
		for(int i=0; i<notas.length; i++) {
			for(int j=0; j<notas[i].length; j++) {
				System.out.println("Digite a: "+(i+1)+ "° nota do participante " + (i+1)+ ": ");
				notas[i][j] = leia.nextFloat();
			}
		}
		for(int i=0; i<notas.length; i++) {
			for(int j=0; j<notas[i].length; j++) {	
				soma += notas[i][j];
			}
			medias[i] = soma / notas[i].length;
			soma = 0.0f;
		}
		for(int t =0; t < medias.length; t++ ) {
			System.out.println("\nMédia do Participante " + (t+1)+ ": "+ medias[t]);
		}
	}
}
