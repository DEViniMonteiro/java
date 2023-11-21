package aula_08;

public class Especializacao extends Curso{
	private String diploma;

	public Especializacao(String nomeCursos, String modalidade, String nomeProfessor, float valor, String periodo, String diploma) {
		super(nomeCursos, modalidade, nomeProfessor, valor, periodo);
		this.diploma = diploma;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Diploma: " + this.diploma);
	}
}
