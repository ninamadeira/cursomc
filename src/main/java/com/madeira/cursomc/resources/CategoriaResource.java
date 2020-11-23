package com.madeira.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madeira.cursomc.domain.Categoria;
import com.madeira.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	
	@GetMapping
	public List<Categoria> listar() {
		List<Categoria> lista = new ArrayList<>();
		lista.add(new Categoria(1, "Informática"));
		lista.add(new Categoria(2, "Escritório"));

		return lista;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.find(id);
		System.out.println(obj);
		return ResponseEntity.ok().body(obj);
		
	}

}
