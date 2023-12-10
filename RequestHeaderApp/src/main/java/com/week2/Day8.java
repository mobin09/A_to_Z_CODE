package com.week2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.io.IOException;


@WebServlet("/day8/mobin/*")
public class Day8 extends HttpServlet{
	
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
    	response.setContentType("text/html");
    	
    	try(PrintWriter out = response.getWriter()){
    		  out.println("<h1>Day 8 of the Servlet</h1>");
    		  out.println("<h2>-----------------------------------------</h2>");
    		  out.println("<h2>Getting the information from the URL</h2>");
    	      out.println("<ol>");
    	            out.println("<li>Request URI:: "+request.getRequestURI()+"</li>");
    	            out.println("<li>URL ::"+request.getRequestURL() +"</li>");
    	            out.println("<li>Path ::" + request.getServletPath() + "</li>");
    	            out.println("<li>Path Info ::" + request.getPathInfo() + "</li>");
    	            out.println("<li>Query String ::" + request.getQueryString() + "</li>");
    	            out.println("<li>Context Path ::" + request.getContextPath() + "</li>");
    	            
    	            out.println("<li>Remote Addr ::" + request.getRemoteAddr() + "</li>");
    	            out.println("<li>Remote Host ::" + request.getRemoteHost() + "</li>");
    	            out.println("<li>Remote IP ::" + request.getRemotePort() + "</li>");
    	            out.println("<li>Remote User::" + request.getRemoteUser() + "</li>");
//    	            request.getRemoteAddr();
//    	            request.getRemoteHost();
//    	            request.getRemotePort();
//    	            request.getRemoteUser();
    	            
    	            
    	      out.println("</ol>");
    	}catch(IOException e) {
    		e.getMessage();
    	}
    	
    }
}
