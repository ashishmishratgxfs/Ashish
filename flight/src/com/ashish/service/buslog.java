package com.ashish.service;

import com.ashish.dao.FlightDAO;
import com.ashish.model.modelclass;

public class buslog {
	
	public boolean addtoDB(modelclass model)
	{
	boolean bln=false;
	
		if(model.getFlightname().equals("ABC"))
		{
			bln=true;
			FlightDAO FDAO = new FlightDAO();
			FDAO.addflighttoDB(model);
		}
		else
		{bln=false;}
	return bln;
	}

}
