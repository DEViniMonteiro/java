package aula_03;

import java.util.Scanner;
public class Lista02_Switch_Exercicio06 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		String nome;
		int idCargo;
		float salario, salarioReajustado;
		
		System.out.println("***Reajuste Salarial***\n");
		System.out.println("1 - Gerente");
		System.out.println("1 - Vendedor");
		System.out.println("1 - Supervisor");
		System.out.println("1 - Motorista");
		System.out.println("1 - Estoquista");
		System.out.println("1 - Técnico de T.I");
		
		
		System.out.println("\nInforme o nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Cargo: ");
		idCargo = leia.nextInt();
		
		System.out.println("Salário: ");
		salario = leia.nextFloat();
		
		
		switch(idCargo){
		case 1:
			salarioReajustado = salario +(0.10f*salario);
			System.out.println("\nSalario Ajustado:");
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salário: R$ %.2f", salarioReajustado );
			break;
		case 2:
			salarioReajustado = salario +(0.07f*salario);
			System.out.println("\nSalario Ajustado:");
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Salário: R$ %.2f", salarioReajustado );
			break;
		case 3:
			salarioReajustado = salario +(0.09f*salario);
			System.out.println("\nSalario Ajustado:");
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.printf("Salário: R$ %.2f", salarioReajustado );
			break;
		case 4:
			salarioReajustado = salario +(0.06f*salario);
			System.out.println("\nSalario Ajustado:");
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.printf("Salário: R$ %.2f", salarioReajustado );
			break;
		case 5:
			salarioReajustado = salario +(0.05f*salario);
			System.out.println("\nSalario Ajustado:");
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Salário: R$ %.2f", salarioReajustado );
			break;
		case 6:
			salarioReajustado = salario +(0.08f*salario);
			System.out.println("\nSalario Ajustado:");
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("Cargo: Técnico de T.I");
			System.out.printf("Salário: R$ %.2f", salarioReajustado );
			break;
		default:
			System.out.println("Codigo Invalido!");
		}
	}
}
