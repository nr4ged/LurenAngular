package com.proyecto.integrador.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_usuario")
public class Usuario {
	@Id
	private String codigo;
	private String nombre;
	private String apellido;
	private String usuario;
	private String clave;
	
	@ManyToOne()
    @JoinColumn(name = "id_tipo")
    TipoUsuario objTipo;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public TipoUsuario getObjTipo() {
		return objTipo;
	}

	public void setObjTipo(TipoUsuario objTipo) {
		this.objTipo = objTipo;
	}
	
}
