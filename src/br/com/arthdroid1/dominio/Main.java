package br.com.arthdroid1.dominio;

public class Main {

	
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("POO EM JAVA");
		curso1.setDescricao("Curso Java");
		curso1.setCargaHoraria(12);
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de IA");
		mentoria.setDescricao("Mentoria com especialista em IA");
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp JAVA");
		bootcamp.setDescricao("Bootcamp para desenvolvedores java");
		bootcamp.getConteudo().add(curso1);
		bootcamp.getConteudo().add(mentoria);
		
		Dev devArthur = new Dev();
		devArthur.setNome("Arthur");
		devArthur.inscreverBootcamp(bootcamp);
		System.out.println("Meus conteudos {Arthur}: " + devArthur.getConteudosInscritos());
		devArthur.progredir();
		System.out.println("Conteudos concluidos {Arthur}: " + devArthur.getConteudosConcluidos());
		System.out.println("------------------------");
		System.out.println("Meus conteudos {Arthur}: " + devArthur.getConteudosInscritos());
		System.out.println("XP" + devArthur.calcularTotalXp() );

		
		Dev devArthDroid = new Dev();
		devArthDroid.setNome("ArthDroid1");
		devArthDroid.inscreverBootcamp(bootcamp);
		System.out.println("Meus conteudos {ArthDroid1}: " + devArthDroid.getConteudosInscritos());
		devArthDroid.progredir();
		devArthDroid.progredir();
		System.out.println("Conteudos concluidos {ArthDroid1}: " + devArthDroid.getConteudosConcluidos());
		System.out.println("------------------------");
		System.out.println("Meus conteudos {ArthDroid1}: " + devArthDroid.getConteudosInscritos());
		System.out.println("XP" + devArthDroid.calcularTotalXp());



		


		
	}

}
