package com.farma.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_detalleventa")
public class DetalleVentaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detV")
	private Integer codigo;
	@Column(name = "cantidad_vendida")
	private int cantidad;
	@Column(name = "precio_unitario")
	private double precioUni;
	@Column(name = "subtotal")
	private double subtotal;
	
	
	@ManyToOne
	@JoinColumn(name = "id_vent")
	private VentaEntity venta;
	
	
	@ManyToOne
	@JoinColumn(name = "id_prod")
	private ProductoEntity producto;


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecioUni() {
		return precioUni;
	}


	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}


	public double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}


	public VentaEntity getVenta() {
		return venta;
	}


	public void setVenta(VentaEntity venta) {
		this.venta = venta;
	}


	public ProductoEntity getProducto() {
		return producto;
	}


	public void setProducto(ProductoEntity producto) {
		this.producto = producto;
	}
	
	
	

}
