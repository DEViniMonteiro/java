package aula_04;

import java.util.Scanner;
public class TabuadaV2 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int numero, i=1, o=1;/*Definir o contador fora do While. */
		
		System.out.println("***Tabuada***");
		System.out.println("\nInforme um numero: ");
		numero = leia.nextInt();
		
		System.out.println("***Adi��o***");
		while(i <= 10) { /*Semelhante ao FOR deve ser Mantido a condi��o dentro de parenteses */
			System.out.println(numero + "+" + i + "=" + (numero+i) );
			i++; /*Contador no final da opera��o. */
		}
		
		System.out.println("\n***Multiplica��o***");
		while(o <= 10) { /*Diferente do FOR, o WHILE n�o permite a Reutiliza��o da variavel 'i', no caso eu tive que criar uma nova, a 'o'.  */
			System.out.println(numero + "x" + o + "=" + (numero*o) );
			o++;
		}
	}
}
