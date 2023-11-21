package aula_08;

public class TestaIngresso {

	public static void main(String[] args) {
		Ingresso evento1 = new Ingresso(1111, "Show do Cazuza", "Rua dos Mortos Vivos - n°333", 231.0f, "25/12/2023");
		Ingresso evento2 = new Ingresso(2222, "Show do Nirvana", "Rua dos Passaros - n°444", 200.0f, "31/12/2023");
		evento1.visualizar();
		evento2.visualizar();
		
		Vip v1 = new Vip(1111, "Show do Cazuza", "Rua dos Mortos Vivos - n°333", 231.0f, "25/12/2023", "X2V12YN", "Camarote 1");
		v1.visualizar();
		
		MeiaEntrada m1 = new MeiaEntrada(1111, "Show do Cazuza", "Rua dos Mortos Vivos - n°333", 231.0f, "25/12/2023", "123UB4UB42");
		m1.visualizar();
	}
}
