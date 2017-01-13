package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.scene.control.Label;

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
	
	public static void addMovie(String title, String director, String description, Label message){
		
		String host="jdbc:mysql://localhost:3306/cinema_ticketsystem_db"; 
		
		try{
			
			Connection myConn = DriverManager.getConnection(host, "root", "volimnebo6!r");
			PreparedStatement myStatement = myConn.prepareStatement("INSERT INTO movie (`title`, `director`, `description`) VALUES (?,?,?)");
			myStatement.setString(1, title);
			myStatement.setString(2, director);
			myStatement.setString(3, description);
			
			myStatement.executeUpdate();
			message.setText("You've succesfully added a Movie!");
			
		}
		catch(Exception e){
			
		}
		
	}
	
}
