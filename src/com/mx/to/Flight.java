package com.mx.to;

import java.util.Date;

public class Flight {

	private int id;
	private String airline;
	private Date scheduledDateTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public Date getScheduledDateTime() {
		return scheduledDateTime;
	}
	public void setScheduledDateTime(Date scheduledDateTime) {
		this.scheduledDateTime = scheduledDateTime;
	}
	
	public String toString() {

		return "id:: "+id
				+" airline:: "+airline
				+" scheduledDateTime"+scheduledDateTime;
	}
}
