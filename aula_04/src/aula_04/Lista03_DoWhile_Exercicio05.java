package aula_04;

import java.util.Scanner;
public class Lista03_DoWhile_Exercicio05 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int n,i=0;
		
		System.out.println("***Soma/Positivo***");
		
		do {
			System.out.println("Digite um Número: ");
			n = leia.nextInt();
			
			if(n > 0) {
				i+=n;
			}
		}while(n !=0);

		System.out.println("\nA Soma dos números positivos é: "+ i);
	}
}
