package com.mx.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.mx.to.Flight;

//@ManagedBean(name = "flightController") -- No funciona bien
@Named
@ViewScoped
public class FlightController extends FlightControllerSuper implements Serializable{



	private  Flight flight = new Flight();
//	private List<Flight> flights = new ArrayList<>(); 
//	private int tipoLinea;
	


	@PostConstruct
    public void init() {
    	System.out.println("Entrando al init...");
    	flight.setId(8888);
    }
    
    public void refresh() {
        System.out.println("Dentro del refresh...............");
    }
    
    public void save() {
        System.out.println("Dentro del save...............");
        System.out.println("Flight.."+flight);
    }
    
    public String redirectToErrorPage() {
    	System.out.println("Dentro del redirectToErrorPage...............");
    	return "error";
    }
    

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
    public void sendError() {
    	System.out.println("Dentro del sendError...............");
    	
    	try {
    		int x= 0/2;
    		int y= 2/0;
    	}catch(Exception ex) {
    		System.out.println("Ocurrio la excepcion");
    		addMessage("Intentelo mas tarde"); 
    	}
    }
    
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public void getData(int pruebaParametro) {
    	System.out.println("Dentro del getData...............");
    	System.out.println("pruebaParametro..............."+pruebaParametro);
    	System.out.println("tipoLinea..............."+tipoLinea);
    	
    	Flight flight1 = new Flight();
    	Flight flight2 = new Flight();
    	
    	flight1.setId(1);
    	flight1.setAirline("Aeromexico"+tipoLinea);
    	flight1.setScheduledDateTime(new Date());
    	
    	flight2.setId(2);
    	flight2.setAirline("Mexicana"+tipoLinea);
    	flight2.setScheduledDateTime(new Date());
    	
    	flights.add(flight1);
    	flights.add(flight2);
    }
    

    
//	public List<Flight> getFlights() {
//		return flights;
//	}
//
//	public void setFlights(List<Flight> flights) {
//		this.flights = flights;
//	}
	
//    public int getTipoLinea() {
//		return tipoLinea;
//	}
//
//	public void setTipoLinea(int tipoLinea) {
//		this.tipoLinea = tipoLinea;
//	}
}
