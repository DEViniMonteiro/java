package aula_08;

public class Medicamento extends Farmacia{
	private String produtor;
	private String tarja;

	public Medicamento(int matricula, String nome, String marca, float preco, String produtor, String tarja) {
		super(matricula, nome, marca, preco);
		this.produtor = produtor;
		this.tarja = tarja;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Produtor: " + this.produtor);
		System.out.println("Tarja: " + this.tarja);
	}
}
