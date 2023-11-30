package com.proyecto.integrador.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_cliente")
public class Cliente {
	@Id
	private String codigo;
	private String nombre;
	private String apellido;
	private String empresa;
	private String nru_documento;
	
	@ManyToOne()
    @JoinColumn(name = "tipo")
    TipoCliente objTipo;

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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNru_documento() {
		return nru_documento;
	}

	public void setNru_documento(String nru_documento) {
		this.nru_documento = nru_documento;
	}

	public TipoCliente getObjTipo() {
		return objTipo;
	}

	public void setObjTipo(TipoCliente objTipo) {
		this.objTipo = objTipo;
	}
	
	
	

}
