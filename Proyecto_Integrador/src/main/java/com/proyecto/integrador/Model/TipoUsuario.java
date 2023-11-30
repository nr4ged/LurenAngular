package com.proyecto.integrador.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table (name = "tb_tipprod")
@AllArgsConstructor
@NoArgsConstructor
public class TipoUsuario {
	
	@Id
	private int tipo_prod;
	private String des_tipo;
	
	@OneToMany(mappedBy = "objTipo")
    @JsonIgnore
    Set<Usuario> usuario;

	public int getTipo_prod() {
		return tipo_prod;
	}

	public void setTipo_prod(int tipo_prod) {
		this.tipo_prod = tipo_prod;
	}

	public String getDes_tipo() {
		return des_tipo;
	}

	public void setDes_tipo(String des_tipo) {
		this.des_tipo = des_tipo;
	}

	public Set<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Set<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	

}
