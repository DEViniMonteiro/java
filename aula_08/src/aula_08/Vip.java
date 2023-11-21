package aula_08;

public class Vip extends Ingresso{
	private String credencialVip;
	private String camarote;

	public Vip(int matricula, String nomeEvento, String endereco, float valor, String data, String credencialVip, String camarote) {
		super(matricula, nomeEvento, endereco, valor, data);
		this.credencialVip = credencialVip;
		this.camarote = camarote;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Credencial: " + this.credencialVip);
		System.out.println("Setor: " + this.camarote);
	}
}
