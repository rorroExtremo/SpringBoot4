package com.mx.to;

public class UserTo {

	private Integer id;
	private String nombre;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "id :: "+this.id
				+"nombre :: "+this.nombre;
	}
}
