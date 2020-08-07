package com.mx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.mx.to.GeneralPojo;

@Named
@ViewScoped
public class ColeccionesController {

	GeneralPojo generalPojo = new GeneralPojo();

	@PostConstruct
    public void init() {
    	System.out.println("Entrando al init ColeccionesController...");
    	List<SelectItem> nombresJuegos = new ArrayList<SelectItem>();
    	nombresJuegos.add(new SelectItem("MM","MegaMan"));
    	nombresJuegos.add(new SelectItem("SFII","Street Fighter II"));
    	nombresJuegos.add(new SelectItem("MB","MarioBros"));
    	nombresJuegos.add(new SelectItem("Zelda","Zelda"));
    	nombresJuegos.add(new SelectItem("Prince","Prince of persia"));
    	nombresJuegos.add(new SelectItem("Far","Far Cry"));
    	
    	generalPojo.setNombresJuegos(nombresJuegos);
    	
    	List<String> usuarios = new ArrayList<String>();
    	usuarios.add("Rorro");
    	usuarios.add("RJ");
    	usuarios.add("Cuchy");
    	generalPojo.setUsuarios(usuarios);
    	
    	List<SelectItem> companiasJuegosList = new ArrayList<SelectItem>();
    	companiasJuegosList.add(new SelectItem("Capcom","Capcom"));
    	companiasJuegosList.add(new SelectItem("Nintendo","Nintendo"));
    	companiasJuegosList.add(new SelectItem("Ubisoft","Ubisoft"));
    	generalPojo.setCompaniasJuegos(companiasJuegosList);
    	
    }
	
	public void guardarInformacion() {
		System.out.println("Entrando al guardarInformacion...");
		System.out.println("consolasSeleccionadas:: "+generalPojo.getConsolasSeleccionadas());
		System.out.println("juegosSeleccionado:: "+generalPojo.getJuegosSeleccionados());
		System.out.println("cualquierCadena:: "+generalPojo.getCualquierString());
	}
	
	public GeneralPojo getGeneralPojo() {
		return generalPojo;
	}

	public void setGeneralPojo(GeneralPojo generalPojo) {
		this.generalPojo = generalPojo;
	}
	
	public void filtrarJuegos() {
		System.out.println("Entrando al filtrarJuegos...");
    	List<SelectItem> nombresJuegos = new ArrayList<SelectItem>();
    	nombresJuegos.add(new SelectItem("MM","MegaMan"));
    	nombresJuegos.add(new SelectItem("SFII","Street Fighter II"));
//    	nombresJuegos.add(new SelectItem("MB","MarioBros"));
//    	nombresJuegos.add(new SelectItem("Zelda","Zelda"));
//    	nombresJuegos.add(new SelectItem("Prince","Prince of persia"));
//    	nombresJuegos.add(new SelectItem("Far","Far Cry"));
    	
    	generalPojo.setNombresJuegos(nombresJuegos);
	}
}
