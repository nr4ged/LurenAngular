package com.proyecto.integrador.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.integrador.Model.Cliente;
import com.proyecto.integrador.Repository.ClienteRepository;
import com.proyecto.integrador.Service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository repoCliente;
	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return repoCliente.findAll();
	}

}
