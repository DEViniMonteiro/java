package aula_08;

public class TestaIngresso {

	public static void main(String[] args) {
		Ingresso evento1 = new Ingresso(1111, "Show do Cazuza", "Rua dos Mortos Vivos - n°333", 231.0f, "25/12/2023");
		Ingresso evento2 = new Ingresso(2222, "Show do Nirvana", "Rua dos Passaros - n°444", 200.0f, "31/12/2023");
		evento1.visualizar();
		evento2.visualizar();
	}
}
