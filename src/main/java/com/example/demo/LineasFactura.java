package com.example.demo;

public class LineasFactura {

	private Long idLinea;
	private Long idArticulo;
	private String nombreArticulo;
	private Double precio;
	public Long getIdLinea() {
		return idLinea;
	}
	public void setIdLinea(Long idLinea) {
		this.idLinea = idLinea;
	}
	public Long getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(Long idArticulo) {
		this.idArticulo = idArticulo;
	}
	public String getNombreArticulo() {
		return nombreArticulo;
	}
	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
