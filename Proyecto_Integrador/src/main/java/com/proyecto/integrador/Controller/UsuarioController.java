package com.proyecto.integrador.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.integrador.Model.Usuario;
import com.proyecto.integrador.Service.UsuarioService;

@RestController
@RequestMapping
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	@GetMapping("Usuario/listar")
	public List<Usuario>listarUsuario(){
		return usuarioService.listarUsuario();
	}
}
