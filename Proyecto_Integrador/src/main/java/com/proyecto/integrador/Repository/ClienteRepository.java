package com.proyecto.integrador.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.integrador.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{

}
