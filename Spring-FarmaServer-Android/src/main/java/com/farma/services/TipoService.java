package com.farma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farma.dao.TipoRepository;
import com.farma.entities.TipoEntity;

@Service
public class TipoService {
	
	@Autowired
	private TipoRepository repo;
	
	
	public List<TipoEntity> listarTodos(){
		return repo.findAll();
	}
}
