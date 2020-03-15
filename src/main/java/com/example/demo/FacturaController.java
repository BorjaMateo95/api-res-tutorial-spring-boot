package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacturaController {
	
	@GetMapping("/facturas")
	public Factura facturas() {
		Factura f = new Factura();
		f.setCliente("Borja Pruebas");
		f.setFecha(new Date());
		f.setIdFactura(new Long(1));
		
		LineasFactura linea1 = new LineasFactura();
		linea1.setIdArticulo(new Long(1212));
		linea1.setIdLinea(new Long(1));
		linea1.setNombreArticulo("Articulo Uno");
		linea1.setPrecio(new Double(5.5));
		
		LineasFactura linea2 = new LineasFactura();
		linea2.setIdArticulo(new Long(2345));
		linea2.setIdLinea(new Long(2));
		linea2.setNombreArticulo("Articulo Dos");
		linea2.setPrecio(new Double(10));
		
		List<LineasFactura> lineas = new ArrayList<>();
		lineas.add(linea1);
		lineas.add(linea2);
		
		f.setLineasFactura(lineas);
		
		return f;
	}

}
