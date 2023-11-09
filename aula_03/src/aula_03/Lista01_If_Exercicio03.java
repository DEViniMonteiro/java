package aula_03;

import java.util.Scanner;
public class Lista01_If_Exercicio03 {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		String nome;
		int idade;
		boolean doacao;
		
		System.out.println("**Campanha de doação de sangue***");
		
		System.out.println("Digite o seu Nome: ");
		nome = leia.next();
		
		System.out.println("Digite sua Idade: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira Doação de sangue?");
		doacao = leia.hasNext();
		
		if (idade < 18) {
			System.out.printf("%s não está apto(a) para doar sangue!",nome);
		}else if(idade >= 18 && idade < 60 && doacao == true ) {
			System.out.printf("%s está apto(a) para doar sangue!",nome);
		}else if (idade >= 60 && idade <=69 && doacao == false) {
			System.out.printf("%s não está apto(a) para doar sangue!",nome);
		}else if (idade >= 60 && idade <=69 && doacao == true) {
			System.out.printf("%s está  apto(a) para doar sangue!",nome);
		}else {
			System.out.printf("%s não está apto(a) para doar sangue!",nome);
		}
	}
}
