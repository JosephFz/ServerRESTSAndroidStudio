package com.farma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farma.entities.ProductoEntity;
import com.farma.services.ProductoService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoService serPro;
	
	@GetMapping("/lista")
	public List<ProductoEntity> lista(){
		return serPro.listarTodos();
	}
	
	@GetMapping("/buscar/{codigo}")
	public ProductoEntity buscar(@PathParam("codigo") Integer cod){
		return serPro.buscarPorID(cod);
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody ProductoEntity bean) {
		serPro.registrar(bean);
	}

	@PostMapping("/actualizar")
	public void actualizar(@RequestBody ProductoEntity bean) {
		serPro.actualizar(bean);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") Integer cod) {
		 serPro.eliminarPorID(cod);
	}
}
