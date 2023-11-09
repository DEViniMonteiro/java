package aula_02;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		double numero1, numero2;
		System.out.println("Digite o Primeiro numero: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o Segundo numero: ");
		numero2 = leia.nextDouble();
		
		System.out.println("Soma: " + (numero1+numero2));
		System.out.println("Subtra��o: " + (numero1-numero2));
		System.out.println("Multiplica��o: " + (numero1*numero2));
		
		if(numero1 == 0 || numero2 == 0) {
			System.out.println("N�o existe divis�o por Zero!");
		}else {
			System.out.println("Divis�o: " + (numero1/numero2));
		}
		System.out.println("M�dulo do numero 1 (Resto da divis�o): " + (numero1%2));
		System.out.println("M�dulo do numero 2 (Resto da divis�o): " + (numero2%2));
		
		System.out.println("Raiz quadrada do numero 1: " + (Math.sqrt(numero1)));
		System.out.println("Raiz quadrada do numero 2: " + (Math.sqrt(numero2)));
		
		System.out.println("Potencia��o do numero 1 pelo numero2: " + (Math.pow(numero1, numero2)));
	}

}
