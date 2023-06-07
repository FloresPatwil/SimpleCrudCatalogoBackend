package com.example.demo.rest;
//Controler

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Articulo;
import com.example.demo.service.ArticuloService;

@RestController
@RequestMapping("/articulos/")
public class ArticuloREST {
	@Autowired
	private ArticuloService articuloService;
	
	@GetMapping
	private ResponseEntity<List<Articulo>> getAllArticulos(){
		return ResponseEntity.ok(articuloService.findAll());
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteArticulo (@PathVariable ("id") Long id){
		articuloService.deleteById(id);
		return ResponseEntity.ok(!(articuloService.findById(id)!=null));
	}
	
	@PostMapping
	private ResponseEntity<Articulo> saveArticulo(@RequestBody Articulo articulo){
		try {
			Articulo articuloGuardado = articuloService.save(articulo);
			return ResponseEntity.created(new URI("/articulos/")).body(articuloGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
}
