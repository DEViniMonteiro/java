package aula_04;

import java.util.Scanner;
public class Lista01_For_Exercicio02 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int numero, c, p=0,i=0;
		
		for (c=1; c<=10; c++) {
			System.out.println("Digite o "+c+"° Número: ");
			numero = leia.nextInt();
			if(numero%2==0) {
				 p++;
			}else {
				i++;
			}
		}
		System.out.println("\nTotal de números pares: "+ p);
		System.out.println("Total de números Impares: "+ i);
	}
}
