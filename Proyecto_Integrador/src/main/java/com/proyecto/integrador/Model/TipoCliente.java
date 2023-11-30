package com.proyecto.integrador.Model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tb_tipocliente")
@AllArgsConstructor
@NoArgsConstructor
public class TipoCliente {
	
	@Id
	private int id_tipocliente;
	private String documento_cliente;
	
	@OneToMany(mappedBy = "objTipo")
    @JsonIgnore
    Set<Cliente> cliente;

	public int getId_tipocliente() {
		return id_tipocliente;
	}

	public void setId_tipocliente(int id_tipocliente) {
		this.id_tipocliente = id_tipocliente;
	}

	public String getDocumento_cliente() {
		return documento_cliente;
	}

	public void setDocumento_cliente(String documento_cliente) {
		this.documento_cliente = documento_cliente;
	}

	public Set<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Set<Cliente> cliente) {
		this.cliente = cliente;
	}
	
	

}
