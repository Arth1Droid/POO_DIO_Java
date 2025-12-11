package br.com.arthdroid1.dominio;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso("Java", "Curso java", 10);
		Mentoria mentoria = new Mentoria("Java", "Curso java", "10/12/2025");

		
		System.out.println(mentoria);
		
	}

}
