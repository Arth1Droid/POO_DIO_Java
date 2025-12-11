package br.com.arthdroid1.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

	private LocalDate data;
	private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Mentoria() {
		this.data = LocalDate.now();
	}
	
	 public Mentoria(String data) {
	        this.data = LocalDate.parse(data, FORMATO);
	    }


	public LocalDate getData() {
		
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "----- Mentoria ----"
				+ "\nTitulo: " + getTitulo() + 
				" \nDescricao: " + getDescricao()
				+ "\nData: " + data.format(FORMATO);
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO + 30d;
	}
	
	
}
