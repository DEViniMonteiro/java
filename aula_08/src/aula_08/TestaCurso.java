package aula_08;

public class TestaCurso {

	public static void main(String[] args) {
		Curso c1 = new Curso("Ingles", "EAD", "Geriscleuso", 250.0f, "Manhã");
		Curso c2 = new Curso("Espanhol", "Live", "Clariosvaldo", 150.5f, "Noite");
		c1.visualizar();
		c2.visualizar();
		
		CursoLivre cl1 = new CursoLivre("Mandarim", "EAD", "Geriscleuso", 350.0f, "Manhã", "5SK348LUJA8");
		cl1.visualizar();
		
		Especializacao ep1 = new Especializacao("ADS", "Live", " Clariostetax", 765.0f, "Noite", "9F8792BI98");
		ep1.visualizar();
	}
}
