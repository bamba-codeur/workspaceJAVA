package fr_179_10_06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public Class

public class FR_179_10_06 {
	
	

	public static void main(String[] args) {
		
		
		ouvrirConnection();

	}

	private static Connection ouvrirConnection() {
		
		Connection con=null;
		
		try {
			 con=DriverManager.getConnection("nomConnexion","user","pwd");
			
			return con;
			
		} catch (SQLException e) {
			// TODO: handle exception
//			System.out.println("Erreur SQL");
		}
		return con;
		
		
		
		
	}

}
