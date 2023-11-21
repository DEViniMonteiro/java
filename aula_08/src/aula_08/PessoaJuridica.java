package aula_08;

public class PessoaJuridica extends Cliente {
	private int cnpj;

	public PessoaJuridica(String nome, int idade, String sexo, float altura, float peso, int cnpj) {
		super(nome, idade, sexo, altura, peso);
		this.cnpj = cnpj;
	}
	
	@Override
	public void visualizar(){
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}
}
