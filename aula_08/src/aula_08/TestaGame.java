package aula_08;

public class TestaGame {

	public static void main(String[] args) {
		Produto p1 = new Produto("Playstation 5", "Sony", 1111, "Video Game", 3999.0f);
		Produto p2 = new Produto("Xbox One", "Microsoft", 2222, "Video Game", 4300.0f);
		p1.visualizar();
		p2.visualizar();
	}

}
