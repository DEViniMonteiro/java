package aula_03;

import java.util.Scanner;
public class Lista01_If_Exercicio02 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		boolean positivo = false;
		
		System.out.println("***Impa ou Par***");
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		
		if(numero>=0) {
			positivo = true;
		}
		
		if(numero % 2==0 && positivo){
			System.out.printf("O numero '%d' é Par e Positivo !",numero);
		}else if(-numero % 2==0 && !positivo){
			System.out.printf("O numero '%d' é Par e Negativo !",numero);	
		}else if(numero % 2==1 && positivo) {
			System.out.printf("O numero '%d' é Impar e Positivo !",numero);
		}else if(-numero % 2==1 && !positivo) {
			System.out.printf("O numero '%d' é Impar e Negativo !",numero);
		}
	}
}
