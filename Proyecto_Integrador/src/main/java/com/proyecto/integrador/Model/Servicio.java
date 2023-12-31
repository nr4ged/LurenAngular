package com.proyecto.integrador.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table (name = "tb_servicio")
public class Servicio {
	
	@Id
	private String cod_servicio;

	private String descripcion_servicio;
	
	private double precio;

	public String getCod_servicio() {
		return cod_servicio;
	}

	public void setCod_servicio(String cod_servicio) {
		this.cod_servicio = cod_servicio;
	}

	public String getDescripcion_servicio() {
		return descripcion_servicio;
	}

	public void setDescripcion_servicio(String descripcion_servicio) {
		this.descripcion_servicio = descripcion_servicio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
