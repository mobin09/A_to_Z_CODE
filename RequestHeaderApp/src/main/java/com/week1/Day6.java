package com.week1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import java.io.PrintWriter;
import java.io.IOException;

@WebServlet("/day6")
public class Day6  extends HttpServlet{
   @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		  response.setContentType("text/html");
		  PrintWriter out  = null;
		  try {
			   out  = response.getWriter();
			  
		  }catch(IOException e) {
			  e.printStackTrace();
		  }
		  
		  
		  ServletContext  context = getServletContext();
		  Integer counter = (Integer)context.getAttribute("count");
		  
		  if(counter == null) {
			  counter = 1;
		  }else {
			  counter++;
		  }
		  
		  
		  
		  context.setAttribute("count", counter);		  
		  
		  System.out.println("Hit count is:::" + counter);
		  out.println("<h1>The Request is hit by :"+ counter  +" times</h1>");
		  
	}
}
