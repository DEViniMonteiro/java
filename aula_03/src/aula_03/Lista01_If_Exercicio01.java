package aula_03;

import java.util.Scanner;
public class Lista01_If_Exercicio01 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int valor1, valor2, valor3, soma;
		
		System.out.print("Digite o 1° Numero: ");
		valor1 = leia.nextInt();
		
		System.out.print("Digite o 2° Numero: ");
		valor2 = leia.nextInt();
		
		System.out.print("Digite o 3° Numero: ");
		valor3 = leia.nextInt();
		
		soma = valor1 + valor2;
		if(soma > valor3){
			System.out.printf("A Soma de %d + %d é Maior do que %d.",valor1,valor2,valor3);
		}else if(soma < valor3){
			System.out.printf("A Soma de %d + %d é Menor do que %d.",valor1,valor2,valor3);
		}else {
			System.out.printf("A Soma de %d + %d é Igual a %d.",valor1,valor2,valor3);
		}	
	}
}
