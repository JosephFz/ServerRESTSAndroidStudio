package com.farma.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_producto")
public class ProductoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prod")
	private Integer codigo;
	@Column(name = "nom_prod")
	private String nombre;
	@Column(name = "descri_prod")
	private String descripcion;
	@Column(name = "precio_prod")
	private double precio;
	@Column(name = "stock")
	private int stock;
	@Column(name = "imagen_prod")
	private String foto;
	

	@ManyToOne
	@JoinColumn(name = "id_Tipo")
	private TipoEntity tipo;
	
	@OneToMany(mappedBy = "producto")
	private List<DetalleVentaEntity> listarDetalleVenta;

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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public TipoEntity getTipo() {
		return tipo;
	}

	public void setTipo(TipoEntity tipo) {
		this.tipo = tipo;
	}

	public List<DetalleVentaEntity> getListarDetalleVenta() {
		return listarDetalleVenta;
	}

	public void setListarDetalleVenta(List<DetalleVentaEntity> listarDetalleVenta) {
		this.listarDetalleVenta = listarDetalleVenta;
	}

	
	
	
	

}
