package aula_08;

public class MeiaEntrada extends Ingresso {
	private String matriculaEscolar;

	public MeiaEntrada(int matricula, String nomeEvento, String endereco, float valor, String data, String matriculaEscolar) {
		super(matricula, nomeEvento, endereco, valor, data);
		this.matriculaEscolar = matriculaEscolar;
	}
	public void visualizar() {
		super.visualizar();
		System.out.println("Matricular Escolar: " + this.matriculaEscolar);
	}
}
