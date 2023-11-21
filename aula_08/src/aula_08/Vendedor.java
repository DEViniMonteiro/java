package aula_08;

public class Vendedor extends Funcionario{
	private String cargo, responsabilidades;
	private float valeRefeicao;
	
	public Vendedor(String nome, float salario, String setor, int matricula, String cargo, String responsabilidades, float valeRefeicao ) {
		super(nome, salario, setor, matricula);
		this.cargo = cargo;
		this.responsabilidades = responsabilidades;
		this.valeRefeicao = valeRefeicao;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Cargo:" + this.cargo);
		System.out.println("Responsabilidades: " + this.responsabilidades);
		System.out.println("VR: " + this.valeRefeicao);
	}
}
