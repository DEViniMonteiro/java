package aula_04;

import java.util.Scanner;
public class Lista03_DoWhile_Exercicio06 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		float media=0.0f, sm=0.0f;
		int n=0, i=0;
		
		System.out.println("***M�dia Multiplos de Tr�s***");
		
		do {
			System.out.println("Digite um numero: ");
			n = leia.nextInt();
			
			if(n %3 ==0 && n !=0) {
				sm+=n;
				i++;
			}
		}while(n !=0);

		media = sm / i;
		System.out.println("A m�dia de todos os n�meros m�ltiplos de 3 �: " + media);
	}
}
