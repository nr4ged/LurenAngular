package com.proyecto.integrador.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.integrador.Model.Servicio;
import com.proyecto.integrador.Service.ServicioService;

@RestController
public class ServicioController {
	
	@Autowired
	private ServicioService servicioService;
	@GetMapping("Servicio/PgServicio")
	public List<Servicio>listarServicio(){
		return servicioService.listarServicio();
	}
	
	@PostMapping("Servicio/ingresar")
	@ResponseBody
	public Servicio ingresarServicio(@RequestBody Servicio objServicio) {
		objServicio.getCod_servicio();
		objServicio.getDescripcion_servicio();
		objServicio.getPrecio();

		return servicioService.ingresarServicio(objServicio);
	}
	
}
