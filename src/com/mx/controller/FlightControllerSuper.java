package com.mx.controller;

import java.util.ArrayList;
import java.util.List;

import com.mx.to.Flight;

public class FlightControllerSuper {

	public int tipoLinea;
	public List<Flight> flights = new ArrayList<>(); 
	
    public int getTipoLinea() {
		return tipoLinea;
	}

	public void setTipoLinea(int tipoLinea) {
		this.tipoLinea = tipoLinea;
	}
	
	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
}
