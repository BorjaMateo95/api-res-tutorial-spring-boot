package com.example.demo;

import java.util.Date;
import java.util.List;

public class Factura {
	
	private Long idFactura;
	private String cliente;
	private Date fecha;
	private List<LineasFactura> lineasFactura;
	
	public Long getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public List<LineasFactura> getLineasFactura() {
		return lineasFactura;
	}
	public void setLineasFactura(List<LineasFactura> lineasFactura) {
		this.lineasFactura = lineasFactura;
	}
	
	
	
	

}
