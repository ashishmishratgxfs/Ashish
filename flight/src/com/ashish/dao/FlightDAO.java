package com.ashish.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


import com.ashish.model.modelclass;

public class FlightDAO {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/fbooking";
	
	static final String USER = "root";
	static final String PASS = "";
	
	public void addflighttoDB(modelclass mcc)
	{
		
		Connection conn = null;
		Statement stmt = null;
		
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			
			String query = "INSERT INTO flightdetails (fligntname,destination,source,fare,aircraftname,NOofseat) VALUES('"+mcc.getFlightname()+ "','" +mcc.getDestinantion()+ "','" +mcc.getSource()+ "','" +mcc.getFare() + "','"+mcc.getAircraft()+ "','"+mcc.getNoofseat()+"');";
			System.out.println(query);
			int result = stmt.executeUpdate(query);
			stmt.close();
			conn.close();
		}
		catch(Exception e)
		{
		System.out.println("Exception Occured"+e);
		}
		
	
		}
		
		}
		
		

	
	

