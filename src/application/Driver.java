package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Driver {
	
	ArrayList<String> array = new ArrayList<String>();
	
	public static void main(String[] args){
			
			String host="jdbc:mysql://localhost:3306/cinema_ticketsystem_db";
			try{
				Connection myConn = DriverManager.getConnection(host, "root", "volimnebo6!r");
				PreparedStatement statement = myConn.prepareStatement("SELECT title FROM movie");
				ResultSet result = statement.executeQuery();
				
				ArrayList<String> array = new ArrayList<String>();
				
				while(result.next()){
					System.out.println(result.getString("title"));
					
					array.add(result.getString("title"));
				}
				System.out.println(array);
				
			}
			catch(Exception e){
				
			}
		}
	}
	