package com.mx.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mx.to.GeneralPojo;

@Named
@ViewScoped
public class ManageAnotationController {

//	@Inject
//	GeneralPojo generalPojo;
	GeneralPojo generalPojo = new GeneralPojo();

	@PostConstruct
    public void init() {
    	System.out.println("Entrando al init ManageAnotationController...");
    	List<SelectItem> nombresJuegos = new ArrayList<SelectItem>();
    	nombresJuegos.add(new SelectItem("MM","MegaMan"));
    	nombresJuegos.add(new SelectItem("SFII","Street Fighter II"));
    	nombresJuegos.add(new SelectItem("MB","MarioBros"));
    	nombresJuegos.add(new SelectItem("Zelda","Zelda"));
    	nombresJuegos.add(new SelectItem("Prince","Prince of persia"));
    	nombresJuegos.add(new SelectItem("Far","Far Cry"));
    	
    	generalPojo.setNombresJuegos(nombresJuegos);
	}
	
	public void guardarInformacion() {
		System.out.println("Entrando al ManageAnotationController.guardarInformacion...");

	}

	public GeneralPojo getGeneralPojo() {
		return generalPojo;
	}

	public void setGeneralPojo(GeneralPojo generalPojo) {
		this.generalPojo = generalPojo;
	}
}
