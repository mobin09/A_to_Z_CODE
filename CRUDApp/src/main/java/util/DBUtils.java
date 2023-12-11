package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.IOException;

public class DBUtils {
    
	
    
    public Connection getConnection() {
    	Connection con = null;  
    	
    	
    	try {
    		String str = "/home/mobin/code/workspace/A_to_Z_CODE/CRUDApp/src/main/java/properties/Dbholder.properties";
    		FileInputStream fis = new FileInputStream(str);
    		Properties prop = new Properties();
    		prop.load(fis);
    		
    		String driver = prop.getProperty("driver");
    		String dbUrl = prop.getProperty("url");
    		String name = prop.getProperty("username");
    		String pass = prop.getProperty("password");
    		Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, name, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e2) {
			e2.printStackTrace();
		} catch(IOException e3) {
			e3.printStackTrace();
		}catch(Exception pe) {
			pe.printStackTrace();
		}
    	
    	return con;
    }
    
}
