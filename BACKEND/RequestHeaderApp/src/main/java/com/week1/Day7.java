package com.week1;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletContext;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;

import java.io.PrintWriter;
import java.io.IOException;

@WebServlet("/day7")
public class Day7 extends HttpServlet{
    private static final long serialVersionUID = 1L;
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();

		ServletContext context = getServletContext();
		context.setAttribute("name", "Mobin");
		context.setAttribute("address", "Delhi");
		
		out.println("<html><head><title>Attribute Data</title></head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1 style='color:blue;'>Dynamic information in ApplicationScope...</h1>");
		out.println("<table border='1'>");
		out.println("<tr><th>AttributeName</th><th>AttributeValue</th></tr>");
		Enumeration<String> attributeNames = context.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			String attributeName = (String) attributeNames.nextElement();
			Object attributeValue = context.getAttribute(attributeName);
			out.println("<tr>");
			out.println("<td>" + attributeName + "</td>");
			out.println("<td>" + attributeValue + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	
	}
}
