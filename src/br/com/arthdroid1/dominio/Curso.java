package br.com.arthdroid1.dominio;

public class Curso {
	private String titulo;
	private String descricao;
	private int cargaHoraria;
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		this.titulo = titulo;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "\n---- Curso ---- "
				+ "\nTitulo: " + titulo + 
				"\nDescricao: " + descricao + 
				"\nCarga Horaria: " + cargaHoraria;
	}
	
	
	
}
