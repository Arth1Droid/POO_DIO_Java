package br.com.arthdroid1.dominio;

public class Main {

	
	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("POO EM JAVA");
		curso.setDescricao("Curso Java");
		curso.setCargaHoraria(12);
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de IA");
		mentoria.setDescricao("Mentoria com especialista em IA");
		
		

		
		System.out.println(curso);
		System.out.println(mentoria);

		
	}

}
