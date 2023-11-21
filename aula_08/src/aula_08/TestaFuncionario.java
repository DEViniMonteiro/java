package aula_08;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Manoel Gomes",4503.3f, "Veiculos",12345);
		Funcionario f2 = new Funcionario("Tais Carla", 3245.0f, "Alimenticio", 54321);
		f1.visualizar();
		f2.visualizar();
		
		Gerente g1 = new Gerente("Pica-pau", 10000.0f, "Produtor de Mantega Escocesa", 2134, "Gerente", "Teste de qualidade");
		g1.visualizar();
		
		
		Vendedor v1 = new Vendedor ("Leoncio", 7000.0f, "Gaita de fole", 4211, "Vendedor", "Vende", 120.0f);
		v1.visualizar();
	}
}
