package aula_08;

public class TestaFarmacia {

	public static void main(String[] args) {
		Farmacia f1 = new Farmacia(1111, "Fenoximetilpenicilina", "Teuto", 125.8f);
		Farmacia f2 = new Farmacia(2222, "Clexane", "Sanofi", 238.9f);
		
		f1.visualizar();
		f2.visualizar();
		
		Medicamento m1 = new Medicamento(1111, "Fenoximetilpenicilina", "Teuto", 125.8f, "Clarividencia" , "Vermelha");
		m1.visualizar();
		
		Perfumaria p1 = new Perfumaria(4412, "Seda Shampoo", "Seda ", 35.5f,"j & j", "21/12/2025" );
		p1.visualizar();
	}
}
