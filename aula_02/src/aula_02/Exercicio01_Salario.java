package aula_02;

import java.util.Scanner;
public class Exercicio01_Salario {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		float salario, abono, novoSalario;
		
		System.out.println("Calculo do Abono Salarial \n");
		
		System.out.print("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.print("Digite o Abono Salarial: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		System.out.println("O novo salario é: " + novoSalario);
	}
}
