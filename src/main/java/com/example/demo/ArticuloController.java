package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Articulo;
import com.example.demo.rest.dto.ArticuloDTO;
import com.example.demo.rest.dto.converter.ArticuloDTOConverter;

@RestController
public class ArticuloController {

	private final ArticuloDTOConverter articuloDtoConverter;
	
	public ArticuloController() {
		articuloDtoConverter = new ArticuloDTOConverter();
	}
	
	@GetMapping("/articulo")
	public ResponseEntity<?> obtenerTodos() {
		
		 Articulo art1 = new Articulo();
		 art1.setId(new Long(1));
		 art1.setNombre("Art 1");
		 art1.setIdFamilia(new Long(1));
		 
		 Articulo art2 = new Articulo();
		 art2.setId(new Long(2));
		 art2.setNombre("Art 2");
		 art2.setId(new Long(2));
		 
		 Articulo art3 = new Articulo();
		 art3.setId(new Long(3));
		 art3.setNombre("Art 3");
		 art3.setId(new Long(3));
		 
		 Articulo art4 = new Articulo();
		 art4.setId(new Long(4));
		 art4.setNombre("Art 4");
		 art4.setId(new Long(1));
		 
		 List<Articulo> lista = new ArrayList<>();
//		 lista.add(art1);
//		 lista.add(art2);
//		 lista.add(art3);
//		 lista.add(art4);
		 
		 if(lista.isEmpty()) {
			 return ResponseEntity.notFound().build();
		 } else {
			List<ArticuloDTO> dtoList = lista.stream()
					.map(articuloDtoConverter::convertToDTO)
					.collect(Collectors.toList());
			
			return ResponseEntity.ok(dtoList);
		 }
		 
	}
}
