package aula_08;

public class PessoaFisica extends Cliente{
	private int cpf;

	public PessoaFisica(String nome, int idade, String sexo, float altura, float peso, int cpf) {
		super(nome, idade, sexo, altura, peso);
		this.cpf = cpf;	
	}
	
	@Override
	public void visualizar(){
		super.visualizar();
		System.out.println("CPF: "+ this.cpf);
	}
}
