package aula_08;

public class CursoLivre extends Curso {
	private String certificado;

	public CursoLivre(String nomeCursos, String modalidade, String nomeProfessor, float valor, String periodo, String certificado) {
		super(nomeCursos, modalidade, nomeProfessor, valor, periodo);
		this.certificado = certificado;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Certificado: " + this.certificado);
	}
}
