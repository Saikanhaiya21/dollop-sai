package com.dollop.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	private static String url="jdbc:mysql://localhost:3306/dollopemp";
	private static String name="root";
	private static String pass="";
	private static Connection con=null;
	
	private static Connection makeConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,name,pass);
		} catch(SQLException e)
 		 {
 		 	e.printStackTrace();
 		 }
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	public static Connection getConnection()
	{
		return makeConnection();
	}

}
