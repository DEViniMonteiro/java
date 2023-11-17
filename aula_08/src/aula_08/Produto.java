package aula_08;

public class Produto {
	private String nome;
	private String marca;
	private int matricula;
	private String tipo;
	private float preco;
	public Produto(String nome, String marca, int matricula, String tipo, float preco) {
		this.nome = nome;
		this.marca = marca;
		this.matricula = matricula;
		this.tipo = tipo;
		this.preco = preco;
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
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		System.out.println("\n\nLoja Gameration");
		System.out.println("Nome: "+ this.nome);
		System.out.println("Marca: "+ this.marca);
		System.out.println("Matricula: "+ this.matricula);
		System.out.println("Tipo: "+ this.tipo);
		System.out.println("Preço: "+ this.preco);
	}
}
