package com.mx.to;

import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named
@SessionScoped
public class GeneralPojo {

	private String cualquierString;
	
	private List<String> usuarios;
	
	private List<SelectItem> nombresJuegos;
	private List<String> consolasSeleccionadas;
	private List<SelectItem> juegosSeleccionados;
	
	private List<SelectItem> companiasJuegos;
	private String companiaSeleccionada;
	
	
	public List<SelectItem> getNombresJuegos() {	
		return nombresJuegos;
	}
	public void setNombresJuegos(List<SelectItem> nombresJuegos) {
		this.nombresJuegos = nombresJuegos;
	}
	public List<String> getConsolasSeleccionadas() {
		return consolasSeleccionadas;
	}
	public void setConsolasSeleccionadas(List<String> consolasSeleccionadas) {
		this.consolasSeleccionadas = consolasSeleccionadas;
	}
	public List<SelectItem> getJuegosSeleccionados() {
		return juegosSeleccionados;
	}
	public void setJuegosSeleccionados(List<SelectItem> juegosSeleccionados) {
		this.juegosSeleccionados = juegosSeleccionados;
	}
	public List<String> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<String> usuarios) {
		this.usuarios = usuarios;
	}
	public String getCualquierString() {
		return cualquierString;
	}
	public void setCualquierString(String cualquierString) {
		this.cualquierString = cualquierString;
	}
	public List<SelectItem> getCompaniasJuegos() {
		return companiasJuegos;
	}
	public void setCompaniasJuegos(List<SelectItem> companiasJuegos) {
		this.companiasJuegos = companiasJuegos;
	}
	public String getCompaniaSeleccionada() {
		return companiaSeleccionada;
	}
	public void setCompaniaSeleccionada(String companiaSeleccionada) {
		this.companiaSeleccionada = companiaSeleccionada;
	}

	
	
	

}
