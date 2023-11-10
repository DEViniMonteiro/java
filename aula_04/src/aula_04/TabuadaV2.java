package aula_04;

import java.util.Scanner;
public class TabuadaV2 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int numero, i=1, o=1;/*Definir o contador fora do While. */
		
		System.out.println("***Tabuada***");
		System.out.println("\nInforme um numero: ");
		numero = leia.nextInt();
		
		System.out.println("***Adição***");
		while(i <= 10) { /*Semelhante ao FOR deve ser Mantido a condição dentro de parenteses */
			System.out.println(numero + "+" + i + "=" + (numero+i) );
			i++; /*Contador no final da operação. */
		}
		
		System.out.println("\n***Multiplicação***");
		while(o <= 10) { /*Diferente do FOR, o WHILE não permite a Reutilização da variavel 'i', no caso eu tive que criar uma nova, a 'o'.  */
			System.out.println(numero + "x" + o + "=" + (numero*o) );
			o++;
		}
	}
}
