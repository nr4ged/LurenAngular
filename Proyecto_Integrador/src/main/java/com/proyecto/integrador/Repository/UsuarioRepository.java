package com.proyecto.integrador.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.integrador.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}
