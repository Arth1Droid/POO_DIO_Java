package br.com.arthdroid1.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria {
	private String titulo;
	private String descricao;
	private LocalDate data;
	private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Mentoria(String titulo, String descricao, String data) {
		this.data = LocalDate.parse(data, FORMATO);
		this.descricao = descricao;
		this.titulo = titulo;
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

	public LocalDate getData() {
		
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "----- Mentoria ----"
				+ "\nTitulo: " + titulo + 
				" \nDescricao: " + descricao 
				+ "\nData: " + data.format(FORMATO);
	}
	
	
}
