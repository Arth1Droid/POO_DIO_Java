package br.com.arthdroid1.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	public Curso() {
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
				+ "\nTitulo: " + getTitulo() + 
				"\nDescricao: " + getDescricao() + 
				"\nCarga Horaria: " + cargaHoraria;
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}
	
	
	
}
