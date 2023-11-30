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

	private int precio;

}
