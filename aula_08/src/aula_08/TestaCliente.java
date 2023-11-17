package aula_08;

public class TestaCliente {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Vinicius",26, "Masculino", 1.7f, 90.0f);
		Cliente c2 = new Cliente("Andressa", 27, "Feminino", 1.5f, 65.7f);
		c1.visualizar();
		c2.visualizar();

	}

}
