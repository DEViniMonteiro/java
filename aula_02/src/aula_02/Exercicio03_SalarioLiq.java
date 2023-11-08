package aula_02;

import java.util.Scanner;
public class Exercicio03_SalarioLiq {
	
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		float salarioBruto, salarioLiquido, addNoturno, hoExtra, desconto;
		
		System.out.println("Calculo Salario Líquido \n");
		
		System.out.print("Digite o Salario Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Digite o valor do Adicional Noturno: ");
		addNoturno = leia.nextFloat();
		
		System.out.print("Digite o valor da Hora Extra: ");
		hoExtra = leia.nextFloat();
		
		System.out.print("Digite o valor do Desconto: ");
		desconto = leia.nextFloat();
		
		salarioLiquido = salarioBruto + addNoturno + (hoExtra*5) - desconto;
		System.out.println("\nO Salario Líquido é: " + salarioLiquido);
	}
}
