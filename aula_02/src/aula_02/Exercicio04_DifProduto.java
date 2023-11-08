package aula_02;

import java.util.Scanner;
public class Exercicio04_DifProduto {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		float numero1, numero2, numero3, numero4, diferenca;
		
		System.out.println("Diferença entre Produtos \n");
		
		System.out.print("Digite o Primeiro numero: ");
		numero1 = leia.nextFloat();
		
		System.out.print("Digite o Segundo numero: ");
		numero2 = leia.nextFloat();
		
		System.out.print("Digite o Terceiro numero: ");
		numero3 = leia.nextFloat();
		
		System.out.print("Digite o Quarto numero: ");
		numero4 = leia.nextFloat();
		
		diferenca = (numero1*numero2)-(numero3*numero4);
		
		System.out.printf(
				"\nA Diferença entre a soma dos numeros '%.1f' e '%.1f', menos, a soma de '%.1f' e '%.1f', é: %.1f!"
				,numero1, numero2, numero3, numero4, diferenca);
	}
}
