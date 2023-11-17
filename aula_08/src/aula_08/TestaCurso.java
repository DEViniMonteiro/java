package aula_08;

public class TestaCurso {

	public static void main(String[] args) {
		Curso c1 = new Curso("Ingles", "EAD", "Geriscleuso", 250.0f, "Manhã");
		Curso c2 = new Curso("Espanhol", "Live", "Clariosvaldo", 150.5f, "Noite");
		c1.visualizar();
		c2.visualizar();
	}
}
