package com.example.demo.rest.dto;

public class CreateArticuloDTO {
	
	private String nombre;
	private Long idFamilia;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getIdFamilia() {
		return idFamilia;
	}
	public void setIdFamilia(Long idFamilia) {
		this.idFamilia = idFamilia;
	}
	
	

}
