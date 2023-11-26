package com.week1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Day4", urlPatterns = { "/day4" }, loadOnStartup = 1, 
       initParams = {
		@WebInitParam(name = "Full_ame", value = "Mobin Arshad"),
		@WebInitParam(name = "age", value = "24"),
		@WebInitParam(name = "address", value = "RN") 
		}
)

public class Day4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		//System.out.println("Day 4 of Servlet");
		res.setContentType("text/html");
		String sName = "Mobin";
		String age = "24";
		String address = "GKP";

		//System.out.println(sName + " " + age + " " + address);

		try {
			PrintWriter out = res.getWriter();
		    out.println("<table style='border:1px solid black'>");
		    out.println("<tr style='border:1px solid black><th>Name</th> <th>Value</th></tr>");
		    ServletConfig config = getServletConfig();
		    Enumeration<String> data = config.getInitParameterNames();
		    while(data.hasMoreElements()) {
		    	
		    	String name = data.nextElement();
		    	String value = config.getInitParameter(name);
		    	
		    	out.println("<tr style='border 1px solid black> <td>"+  name +"</td>" + "<td>"+value + "</td> </tr>");
		    	
		    	System.out.println("name:" + name + " value:" + value);
		    }
		    
		    
		  
		    
		    
		    out.println("</table>");
		    
		    String nme= config.getInitParameter("Full_ame");
		    String  age1 = config.getInitParameter("age");
		    String addr = config.getInitParameter("address");
		    
		    out.println("<h1>"+nme+ ", "+age1+","+addr +"</h1>");
		    
		    out.close();
		    

		} catch (IOException e) {
			e.getStackTrace();
		}

	}
}
