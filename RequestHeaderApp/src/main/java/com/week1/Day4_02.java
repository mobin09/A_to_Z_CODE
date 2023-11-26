package com.week1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.dao.DButils;

@WebServlet("/registration")

//registration

public class Day4_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		Connection con = null;
		PreparedStatement pstmt = null;

		res.setContentType("text/html");
		try {
			String name = req.getParameter("name");
			String age = req.getParameter("age");
			String address = req.getParameter("address");
			PrintWriter out = res.getWriter();

			// out.println(name + " " + age + " " + address);
			con = DButils.getConnection();

			String q = "INSERT INTO Students(name,age,address) values(?,?,?)";
			pstmt = con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(age));
			pstmt.setString(3, address);

			int updatedRow = pstmt.executeUpdate();

			if (updatedRow == 1) {
				out.println("<h1 style='text-align:center;color:green'>REGISTRATION IS SUCCESSFULLY</h1>");
			} else {
				out.println("<h1 style='text-align:center;color:red'>REGISTRATION IS FAILED TRY AGAIN</h1>");
				out.println("<a href = './reg.html'>Register Again</a>");
			}

		} catch (IOException e) {
			e.getMessage();
		} catch (Exception ep) {
			ep.getStackTrace();
		}
	}
}
