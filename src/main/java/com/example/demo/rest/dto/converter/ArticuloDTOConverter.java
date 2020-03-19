package com.example.demo.rest.dto.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.demo.modelo.Articulo;
import com.example.demo.rest.dto.ArticuloDTO;

@Component
public class ArticuloDTOConverter {

	private final ModelMapper modelMapper;
	
	
	public ArticuloDTOConverter() {
		super();
		this.modelMapper = new ModelMapper();
	}


	public ArticuloDTO convertToDTO(Articulo arti) {
		return modelMapper.map(arti, ArticuloDTO.class);
	}
}
