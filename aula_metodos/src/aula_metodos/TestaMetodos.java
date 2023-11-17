package aula_metodos;

import static aula_metodos.pacote01.Classe02.*;

public class TestaMetodos {

	public static void main(String[] args) {
		// Chamadas para os Métodos Locais
		metodoPublico();
		metodoFriendly();
		metodoProtegido();
		metodoPrivado();

		
		// Chamadas para os Métodos da Classe01
		Classe01.metodoPublico01();
		Classe01.metodoFriendly01();
		Classe01.metodoProtegido01();
		// Classe01.metodoPrivado01(); Metodo privado so pode ser usado dentro do
		// projeto que foi criado.

		
		// Chamadas para os Métodos da Classe02 - Pacote01
		metodoPublico02();
		//metodoFriendly02();Por ser Friendly só pode ser usado por classes dentro do mesmo pacote.
		//metodoProtegido02(); Por ser protegido Funciona somente Dentro dos mesmo pacote ou por herança.  
		//metodoPrivado02(); Metodo privado so pode ser usado dentro do projeto que foi criado.
	}

	public static void metodoPublico() {
		System.out.println("Método Público!");
	}
	static void metodoFriendly() {
		System.out.println("Método Friendly!");
	}
	protected static void metodoProtegido() {
		System.out.println("Método Protegido!");
	}
	private static void metodoPrivado() {
		System.out.println("Método Privado!");
	}
}
