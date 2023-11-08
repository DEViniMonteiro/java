package aula_02;

import java.util.Scanner;

public class Operadores {

	/* Importa o Scanner, permitindo que qualquer metodo, dentro desse projeto, utilize o mesmo.*/
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero1 = 10, numero2 = 20, idade = 26, tamanho;
		String valor1 = "2", valor2 = "3", nome = "Vinicius";
		float media = 2.456789f;
		

		/* Printa e quebra a Linha*/
		System.out.println("A somma das variaveis numero1 e numero2 é igual a: " + (numero1 + numero2) + ".");
		System.out.println("A somma das variaveis valor1 e valor2 é igual a: " + (valor1 + valor2) + ".");
		/* Printa sem quebrar a Linha*/
		System.out.print("Olá, Meu nome é " + nome + " e tenho " + idade);
		/* Permite personalisar o Print e não quebra a linha*/
		System.out.printf("\nA média final de %s, é %.2f !",nome, media); /*Ao denifir '%s', ele pega a primeira variavel do tipo String e aplica no texto. A mesma coisa acontece quando é inserido '%.2f' ele aplica a primeira variavel do tipo float/double */
		System.out.println("\nDigite o tamanho: ");
		tamanho = leia.nextInt();/*Armazena o valor/texto digitado na variavel 'tamanho'.*/

		System.out.println("O valor digitado foi: " + tamanho);
	}

}
