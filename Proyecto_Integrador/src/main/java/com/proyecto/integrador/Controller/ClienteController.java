package com.proyecto.integrador.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.integrador.Model.Cliente;
import com.proyecto.integrador.Service.ClienteService;

@RestController
@RequestMapping
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	@GetMapping("Cliente/listar")
	public List<Cliente>listarCliente(){
		return clienteService.listarCliente();
		
	}
}
