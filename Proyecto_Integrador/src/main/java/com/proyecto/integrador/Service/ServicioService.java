package com.proyecto.integrador.Service;

import java.util.List;

import com.proyecto.integrador.Model.Servicio;

public interface ServicioService {
	
	public List<Servicio>listarServicio();
	
	public Servicio ingresarServicio(Servicio objServicio);

}
