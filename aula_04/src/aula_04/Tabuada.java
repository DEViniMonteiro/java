package aula_04;

import java.util.Scanner;
public class Tabuada {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		
		System.out.println("***Tabuada***");
		System.out.println("Informe um numero: ");
		numero = leia.nextInt();
		
		System.out.println("***Adição***");
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero + "+" + i + " = " + (numero+i) );
		}
		
		System.out.println("\n***Multiplicação***");
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero + "x" + i + " = " + (numero*i) );
		}
	}

}
