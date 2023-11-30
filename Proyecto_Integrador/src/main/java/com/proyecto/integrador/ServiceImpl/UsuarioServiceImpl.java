package com.proyecto.integrador.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.integrador.Model.Usuario;
import com.proyecto.integrador.Repository.UsuarioRepository;
import com.proyecto.integrador.Service.UsuarioService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository repoUsuario;
	@Override
	public List<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		return repoUsuario.findAll();
	}

}
