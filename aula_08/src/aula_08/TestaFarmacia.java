package aula_08;

public class TestaFarmacia {

	public static void main(String[] args) {
		Farmacia f1 = new Farmacia(1111, "Fenoximetilpenicilina", "Teuto", "Vermelha", 125.8f);
		Farmacia f2 = new Farmacia(2222, "Clexane", "Sanofi", "Vermelha", 238.9f);
		
		f1.visualizar();
		f2.visualizar();
		
	}

}
