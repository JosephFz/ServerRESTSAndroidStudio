package com.farma.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farma.entities.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer>{

}
