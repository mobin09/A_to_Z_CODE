package com.week1;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.IOException;

@WebServlet("/day5")
public class Day5 extends HttpServlet{
     @Override
     public void doGet(HttpServletRequest request, HttpServletResponse response) {
    	   response.setContentType("text/html");
    	   
    	   try {
    		   PrintWriter out = response.getWriter();
    		   ServletConfig config = getServletConfig();
    		   ServletContext context = getServletContext();
               out.println("<h1>Implementation class w.r.t Tomcat server</h1>");
               out.println("<h2>ServletConfig implementation class: " +config.getClass().getName());
               out.println("<h2>ServletContext implementation class: " + context.getClass().getName());
               out.println("<h2>Request implementation class: " + request.getClass().getName());
               out.println("<h2>Response implementation class: " + response.getClass().getName());
               out.close();
    		   
    	   }catch(IOException e) {
    		   e.printStackTrace();
    	   } catch(Exception e1) {
    		   e1.printStackTrace();
    	   }
    	   
    	   
    	   
    	   
     }
}
