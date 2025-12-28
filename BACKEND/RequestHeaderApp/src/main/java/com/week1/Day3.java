package com.week1;

// Example to show how servlet is working on multithreading

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/day3")

public class Day3  extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
    	res.setContentType("text/html");
    	
    	try(PrintWriter out = res.getWriter()){
    		
    		out.println("<h1>Servlet Example: Day3</h1>");
    		LocalDateTime date = LocalDateTime.now();
    		int hour = date.getHour();
    		String message = "";
    		if(hour < 12) {
    			message = "Good Morning";
    		}else if(hour < 16) {
    			message = "Good Afternoon";
    		}else if(hour < 20) {
    			message = "Good Evening";
    		}else {
    			message = "Good Night";
    		}
    		
    		
    		out.println("<h3>Hello Mr/Mrs:" + message + "</h3>");
    		out.println("<h3>Current Date time is:" + date +"</h3>");
    		
    		// Object of request and response object and it's hash code
    		out.println("<h3>Request Objec Address is :" + req.hashCode() + "</h3>");
    		out.println("<h3>Response Object Address is:" + res.hashCode() + "</h3>");
    		out.println("<h3>Current Object Address is:" + this.hashCode() + "</h3>");
    		out.println("<h3>Current Thread Object Address is:" + Thread.currentThread().hashCode() +"</h3>");
    		
    		Thread.sleep(40000);
    		
    		
    	}catch(IOException eox) {
    		eox.getStackTrace();
    	}catch(Exception ex) {
    		ex.getStackTrace();
    	}
    	
    }
}
