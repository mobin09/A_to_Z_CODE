package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;

import java.io.PrintWriter;
import java.io.IOException;

// we don't know what type of request is so we need to handle both type of request GET and POST

@WebServlet("/controller/*")

public class controllerCRUDApp extends HttpServlet{
	  private static final long serialVersionUID = 1L;

	@Override
      public void doGet(HttpServletRequest request, HttpServletResponse response) {
		  doProcess(request, response);
	  }
	  @Override
	  public void doPost(HttpServletRequest request, HttpServletResponse response) {
		  doProcess(request, response);
	  }
	  
	  public void doProcess(HttpServletRequest request, HttpServletResponse response) { 
		  response.setContentType("text/html");
		  String path = "";
		  PrintWriter out = null;
		  try{
			   out = response.getWriter();
			   path = request.getPathInfo();
//			   System.out.println("Path Information:" + path);
			  
		  }catch(IOException e) {
			  e.printStackTrace();
		  }
		  
		  if(path.equalsIgnoreCase("/registration")) {
			    out.println("<h1>Welcome to Registration portal</h1>");
		  }else if(path.equalsIgnoreCase("/search")) {
			  out.println("<h1>Search Portal</h1>");
		  }else if(path.equalsIgnoreCase("/delete")) {
			  out.println("<h1>Delete Portal</h1>");
		  }else if(path.equalsIgnoreCase("/update")) {
			  out.println("<h1>Welcome to Update Portal</h1>");
		  }
		  
		  else {
			  out.println("<h1>404 PAGE NOT FOUND.... Wrong Input Request to Server</h1>");
		  }
		  
		  
		  
		   
	  
	  }
	  
	  
	  
}
