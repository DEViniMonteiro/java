package aula_08;

public class Perfumaria extends Farmacia {
	private String produtor;
	private String validade;

	public Perfumaria(int matricula, String nome, String marca, float preco, String produtor, String validade) {
		super(matricula, nome, marca, preco);
		this.produtor = produtor;
		this.validade = validade;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("Produtor: " + this.produtor);
		System.out.println("Validade: " + this.validade);
	}
}
