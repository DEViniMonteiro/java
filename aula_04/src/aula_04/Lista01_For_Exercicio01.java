package aula_04;

import java.util.Scanner;
public class Lista01_For_Exercicio01 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		int numInicial, numFinal, i;

		System.out.println("***Multipos de 3 e 5***");
		System.out.println("Digite o Primeiro Numero do intervalo: ");
		numInicial = leia.nextInt();
		
		System.out.println("Digite o �ltimo N�mero do intervalo: ");
		numFinal = leia.nextInt();
		
		
		if(numInicial < numFinal){
			System.out.printf("\nNo intervalo de %d e %d: \n\n", numInicial, numFinal);
			for(i=numInicial; i <= numFinal; i++) {
				if(i%3==0 && i%5==0) {
					System.out.println(i + " � m�ltiplo de 3 e 5");
				}
			}
		}else if ((numFinal < 0) == (numInicial < 0)) {
			System.out.println("Intervalo inv�lido!");
		}else {
			System.out.println("Intervalo inv�lido!");
		}
	}
}
