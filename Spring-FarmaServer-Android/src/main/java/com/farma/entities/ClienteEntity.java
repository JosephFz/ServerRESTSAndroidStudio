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
@Table(name = "tb_clientes")
public class ClienteEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cli")
	private Integer codigo;
	@Column(name = "nom_cli")
	private String nombre;
	@Column(name = "ape_cli")
	private String apellidos;
	@Column(name = "direccion_cli")
	private String direccion;
	@Column(name = "telefono_cli")
	private String telefono;
	@Column(name = "correo_cli")
	private String correo;
	@Column(name = "clave")
	private String clave;

	@OneToMany(mappedBy = "cliente")
	@JsonIgnore
	private List<VentaEntity> listarVentas;


	
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public List<VentaEntity> getListarVentas() {
		return listarVentas;
	}

	public void setListarVentas(List<VentaEntity> listarVentas) {
		this.listarVentas = listarVentas;
	}

}
