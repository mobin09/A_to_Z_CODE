package com.week1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Day1_01")
public class Day1_01  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
     public void doGet(HttpServletRequest req, HttpServletResponse res) {
    	  res.setContentType("text/html");
    	  
      }
}
