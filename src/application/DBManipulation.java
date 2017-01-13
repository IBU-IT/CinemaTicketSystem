package application;
import java.sql.*;

public class DBManipulation {

	public static boolean ConnectToDataBase(String user,String password) {	
		

		String host="jdbc:mysql://localhost:3306/cinema_ticketsystem_db"; 
			
			try {
				Connection myConn=DriverManager.getConnection(host, user, password);
			//	System.out.println("Worked");
				return true;
			} catch (SQLException e) {
			//	// TODO Auto-generated catch block			
				return false;
			}		
		}
	
	public static void addMovie(String title, String director, String description){
		
		
		
	}
	// "+title+", "+director+", "+description"
}
