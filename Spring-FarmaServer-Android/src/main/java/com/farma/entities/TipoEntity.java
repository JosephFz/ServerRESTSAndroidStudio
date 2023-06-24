package com.farma.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo")
public class TipoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipo")
	private Integer codigo;
	@Column(name = "descripcion")
	private String nombre;
	
	
	@OneToMany(mappedBy = "tipo")
	@JsonIgnore
	private List<ProductoEntity> listarProductos;


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<ProductoEntity> getListarProductos() {
		return listarProductos;
	}


	public void setListarProductos(List<ProductoEntity> listarProductos) {
		this.listarProductos = listarProductos;
	}
	
	
}
