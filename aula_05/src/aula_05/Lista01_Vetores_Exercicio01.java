package aula_05;

import java.util.Scanner;
public class Lista01_Vetores_Exercicio01 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10 ,6};
		int numero =0, aux=0;
		
		System.out.println("Digite o número que deseja encontrar: ");
		numero = leia.nextInt();
		
		for(int i=0; i< vetor.length; i++) {
			if(vetor[i] == numero ) {
				System.out.println("O número "+ numero + " esta na posição: " + i );
				aux=1;	
			}
		}
		if(aux==0){
			System.out.println("O número " + numero + " não foi encontrado!");
		}
	}
}
