package com.week1;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import javax.servlet.ServletOutputStream;

@WebServlet("/day2")
public class Day2 extends HttpServlet{
    private static final long serialVersionUID = 1L;

	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
		res.setContentType("image/jpeg");
		try {
			///home/mobin/code/workspace/A_to_Z_CODE/RequestHeaderApp/Mobin.jpeg
			  String projectName = "RequestHeaderApp";
		      String absolutePath = System.getProperty("user.dir") + File.separator +
		    		  "code"+File.separator+"workspace"+File.separator+"A_to_Z_CODE"+File.separator+ projectName;
			  System.out.println("Directory:--------------> " +absolutePath);
			//Reading of Data
			File f = new File(absolutePath + File.separator + "Mobin.jpeg"); 
			FileInputStream fis = new FileInputStream(f);
			byte[] b = new byte[(int)f.length()];
			fis.read(b);
			
			// Write to Client
			ServletOutputStream  ois= res.getOutputStream();
			ois.write(b);
			ois.flush();
			
			// closing the resource
			ois.close();
			fis.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}
}
