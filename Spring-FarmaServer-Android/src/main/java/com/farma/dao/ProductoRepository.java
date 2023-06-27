package com.farma.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farma.entities.ProductoEntity;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer>{

}
