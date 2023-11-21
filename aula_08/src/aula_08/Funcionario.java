package aula_08;

public class Funcionario {
	private String nome;
	private float salario;
	private String setor;
	private int matricula;
	public Funcionario(String nome, float salario, String setor, int matricula) {
		this.nome = nome;
		this.salario = salario;
		this.setor = setor;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void visualizar() {
		System.out.println("\n\nCadastro de Funcionarios:");	
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
		System.out.println("Setor: " + this.setor);
		System.out.println("Matricula: " + this.matricula);
	}
}
