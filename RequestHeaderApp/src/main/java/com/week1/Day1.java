package com.week1;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.io.IOException;


@WebServlet("/day1")
public class Day1 extends HttpServlet{
     private static final long serialVersionUID = 1L;

	@Override
     public void doGet(HttpServletRequest req, HttpServletResponse res)  throws ServletException{
    	   res.setContentType("text/html");
    	   
    	   try(PrintWriter out = res.getWriter()){
    		    out.println("<h1>Header Information</h1>");
    		    Enumeration<String> header = req.getHeaderNames();
    		    out.println("<table style='border:1px solid black; position:absolute; top:50%; left:50%; transform: translate(-50%, -50%)'>");
    		    out.println("<tr style='border:1px solid black'><th style='border:1px solid black; width:25%'>Header Name </th> <th style='border:1px solid black'> Header Value </th></tr>");
    		    while(header.hasMoreElements()) {
    		    	String hname = (String)header.nextElement();
    		    	String hValue = req.getHeader(hname);
    		    	out.println("<tr style='border:1px solid black'>");
    		    	out.println("<td style='border:1px solid black'>" +hname+ "</td>");
    		    	out.println("<td style='border:1px solid black'>" +hValue+ "</td>");
    		    	out.println("</tr>");
    		    	
    		    }
    		    out.println("</table>");
    		    
    	   }catch(IOException e) {
    		   e.getMessage();
    	   }
     }
}
