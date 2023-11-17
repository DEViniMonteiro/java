package aula_08;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Manoel Gomes",4503.3f,"Supervisor", "Veiculos",12345);
		Funcionario f2 = new Funcionario("Tais Carla", 3245.0f, "Blogueira", "Alimenticio", 54321);
		f1.visualizar();
		f2.visualizar();
	}

}
