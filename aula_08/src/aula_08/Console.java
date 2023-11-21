package aula_08;

public class Console extends Produto {
	private int codSerie;
	 
	public Console(String nome, String marca, int matricula, String tipo, float preco, int codSerie) {
		super(nome, marca, matricula, tipo, preco);
		this.codSerie = codSerie;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("Codigo de Serie: " + this.codSerie);
	}
}
