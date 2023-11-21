package aula_08;

public class TestaGame {

	public static void main(String[] args) {
		Produto p1 = new Produto("Playstation 5", "Sony", 1111, "Video Game", 3999.0f);
		Produto p2 = new Produto("Xbox One", "Microsoft", 2222, "Video Game", 4300.0f);
		p1.visualizar();
		p2.visualizar();
		
		Jogo g1 = new Jogo("Residente Evil 4", "Capcom",1111, "Video Game", 3999.0f,"Capcom", "Fisica");
		g1.visualizar();
		
		Console c1 = new Console("Playstation 5", "Sony", 1111, "Video Game", 3999.0f, 213241);
		c1.visualizar();
	}
}
