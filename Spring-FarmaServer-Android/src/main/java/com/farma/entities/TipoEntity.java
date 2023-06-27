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
	@Column(name = "id_Tipo")
	private Integer codigo;
	@Column(name = "descripcion")
	private String nombre;
	@Column(name = "imagen_tipo")
	private String foto;
	
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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public List<ProductoEntity> getListarProductos() {
		return listarProductos;
	}

	public void setListarProductos(List<ProductoEntity> listarProductos) {
		this.listarProductos = listarProductos;
	}

	
	
	
	
}
