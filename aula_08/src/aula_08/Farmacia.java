package aula_08;

public class Farmacia {
	private int matricula;
	private String nome;
	private String marca;
	private float preco;
	public Farmacia(int matricula, String nome, String marca, float preco) {
		this.matricula = matricula;
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		System.out.println("\n\nFarmacia Anjo Guardião!");
		System.out.println("Matricula: "+this.matricula);
		System.out.println("Nome: "+this.nome);
		System.out.println("Marca: "+this.marca);
		System.out.println("Preço: "+this.preco);
	}
	
	
}
