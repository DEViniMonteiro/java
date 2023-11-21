package aula_08;

public class Jogo extends Produto{
	private String produtor;
	private String midia;
	
	public Jogo(String nome, String marca, int matricula, String tipo, float preco, String produtor, String midia) {
		super(nome, marca, matricula, tipo, preco);
		this.produtor = produtor;
		this.midia = midia;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Produtor: " + this.produtor);
		System.out.println("Midia: " + this.midia);
	}
}
