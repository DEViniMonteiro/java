package aula_08;

public class Ingresso {
	private int matricula;
	private String nomeEvento;
	private String endereco;
	private float valor;
	private String data;
	public Ingresso(int matricula, String nomeEvento, String endereco, float valor, String data) {
		this.matricula = matricula;
		this.nomeEvento = nomeEvento;
		this.endereco = endereco;
		this.valor = valor;
		this.data = data;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public void visualizar () {
		System.out.println("\n\nEvegen: ");
		System.out.println("Id do ingresso: "+this.matricula);
		System.out.println("Nome do Evento: "+this.nomeEvento);
		System.out.println("Endereço: "+ this.endereco);
		System.out.println("Valor: " + this.valor);
		System.out.println("Data do evendo: " + this.data);
	}	
}
