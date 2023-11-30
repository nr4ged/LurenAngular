package com.proyecto.integrador.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.integrador.Model.Servicio;
import com.proyecto.integrador.Repository.ServicioRepository;
import com.proyecto.integrador.Service.ServicioService;

@Service
public class ServicioServiceImpl implements ServicioService{

	@Autowired
	private ServicioRepository repoServicio;
	@Override
	public List<Servicio> listarServicio() {
		// TODO Auto-generated method stub
		return repoServicio.findAll();
	}

	@Override
    public Servicio ingresarServicio(Servicio objServicio) {
        // TODO Auto-generated method stub
        return repoServicio.save(objServicio);
    }

}
