package aula_08;

public class Curso {
	private String nomeCursos;
	private String modalidade; 
	private String nomeProfessor;
	private float valor;
	private String periodo;
	public Curso(String nomeCursos, String modalidade, String nomeProfessor, float valor, String periodo) {
		this.nomeCursos = nomeCursos;
		this.modalidade = modalidade;
		this.nomeProfessor = nomeProfessor;
		this.valor = valor;
		this.periodo = periodo;
	}
	public String getNomeCursos() {
		return nomeCursos;
	}
	public void setNomeCursos(String nomeCursos) {
		this.nomeCursos = nomeCursos;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public void visualizar() {
		System.out.println("\n\nGerneration !");
		System.out.println("Nome do Curso: "+ this.nomeCursos);
		System.out.println("Modalidade: " + this.modalidade);
		System.out.println("Professor: " + this.nomeProfessor);
		System.out.println("Valor: " + this.valor);
		System.out.println("Periodo: " + this.periodo);
	}
}
