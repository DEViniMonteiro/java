package aula_08;

public class Gerente extends Funcionario{
	private String cargo, responsabilidade;
	public Gerente(String nome, float salario, String setor, int matricula, String cargo, String responsabilidade) {
		super(nome, salario, setor, matricula);
		this.cargo = cargo;
		this.responsabilidade = responsabilidade;
	}

	public void visualizar () {
	super.visualizar();
	System.out.println("Cargo: " + this.cargo );
	System.out.println("Responsabilidades: " + this.responsabilidade);
	}

	
}
