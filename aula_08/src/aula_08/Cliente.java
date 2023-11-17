package aula_08;

public class Cliente {
	private String nome;
	private int idade;
	private String sexo;
	private float altura;
	private float peso;
	public Cliente(String nome, int idade, String sexo, float altura, float peso) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void visualizar () {
		System.out.println("\n\nCadastro de clientes: ");
		System.out.println("Nome: "+ this.nome);
		System.out.println("Idade: " +this.idade);
		System.out.println("Sexo: " +this.sexo);
		System.out.println("Altura: " +this.altura);
		System.out.println("Peso: " +this.peso);
	}
}
