package aula_08;

public class TestaCliente {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Vinicius",26, "Masculino", 1.7f, 90.0f);
		Cliente c2 = new Cliente("Andressa", 27, "Feminino", 1.5f, 65.7f);
		c1.visualizar();
		c2.visualizar();
		
		PessoaFisica cpf = new PessoaFisica("Clariosvaldo", 27, "Indefinido", 1.9f, 130.0f, 12345678); 
		cpf.visualizar();
		
		PessoaJuridica cnpj = new PessoaJuridica("Geriscleuso", 66, "Papagaio", 1.9f, 180.0f, 9876531);
		cnpj.visualizar();
	}

}
