package com.ashish.controller;

import java.awt.image.RescaleOp;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ashish.model.modelclass;
import com.ashish.service.buslog;

/**
 * Servlet implementation class ashishregister
 */
//@WebServlet("/ashishregister")
public class ashishregister extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ashishregister() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Flightname = request.getParameter("flightname");
	    String Source = request.getParameter("Source");
	    String Destinantion = request.getParameter("Destination");
	    String Fare = request.getParameter("Fare");
	    String Noofseat = request.getParameter("Noofseat");
	    String aircraft = request.getParameter("aircraftname");
	    
	    System.out.println ("B");
	    
	    modelclass MC = new modelclass();
	    MC.setFlightname(Flightname);
	    MC.setAircraft(aircraft);
	    MC.setDestinantion(Destinantion);
	    MC.setSource(Source);
	    MC.setNoofseat(Noofseat);
	    MC.setFare(Fare);
	   
	  buslog BL = new buslog();
	  boolean B;
	  B = BL.addtoDB(MC);
	 
	  if(B)
	  {
		  System.out.println("Done");
		 // request.setAttribute("flight", MC);
		  request.getRequestDispatcher("flightresult.jsp").forward(request, response);
	  }
	  
	  else 
	  {
		  System.out.println("False");
		  response.sendRedirect("https://www.google.com");
	  }
	  
	  }
	  }

