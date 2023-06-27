package com.farma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farma.dao.ProductoRepository;
import com.farma.entities.ProductoEntity;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository repo;
	
	public List<ProductoEntity> listarTodos(){
		return repo.findAll();
	}
	
	public void registrar(ProductoEntity p) {
		repo.save(p);
	}
	
	public void actualizar(ProductoEntity p) {
		repo.save(p);
	}
	
	public void eliminarPorID(Integer cod) {
		repo.deleteById(cod);
	}
	
	public ProductoEntity buscarPorID(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
	
	
}
