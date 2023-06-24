package com.farma.entities;

import java.time.LocalDate;
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
@Table(name = "tb_venta")
public class VentaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vent")
	private Integer codigo;
	@Column(name = "fecha_vent")
	private LocalDate fecha;
	@Column(name = "total")
	private double total;

	@ManyToOne
	@JoinColumn(name = "id_cli")
	private ClienteEntity cliente;
	

	@OneToMany(mappedBy = "venta")
	private List<DetalleVentaEntity> listarDetalleVenta;


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public ClienteEntity getCliente() {
		return cliente;
	}


	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}


	public List<DetalleVentaEntity> getListarDetalleVenta() {
		return listarDetalleVenta;
	}


	public void setListarDetalleVenta(List<DetalleVentaEntity> listarDetalleVenta) {
		this.listarDetalleVenta = listarDetalleVenta;
	}
	
	

	
}
