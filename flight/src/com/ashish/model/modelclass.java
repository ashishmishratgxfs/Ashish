package com.ashish.model;

import com.ashish.service.buslog;

public class modelclass {
	private String Flightname;
	private String Source;
	private String Destinantion;
	private String Fare;
	private String Noofseat;
	private String aircraft;
	public String getFlightname() {
		return Flightname;
	}
	public void setFlightname(String flightname) {
		Flightname = flightname;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestinantion() {
		return Destinantion;
	}
	public void setDestinantion(String destinantion) {
		Destinantion = destinantion;
	}
	public String getFare() {
		return Fare;
	}
	public void setFare(String fare) {
		Fare = fare;
	}
	public String getNoofseat() {
		return Noofseat;
	}
	public void setNoofseat(String noofseat) {
		Noofseat = noofseat;
	}
	public String getAircraft() {
		return aircraft;
	}
	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	
}
