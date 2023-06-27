package com.farma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farma.entities.TipoEntity;
import com.farma.services.TipoService;

@RestController
@RequestMapping("/tipo")
public class TipoController {

	@Autowired
	private TipoService serTipo;
	
	@GetMapping("/lista")
	public List<TipoEntity> lista(){
		return serTipo.listarTodos();
	}
}
