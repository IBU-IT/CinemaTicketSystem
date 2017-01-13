package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ReservationController implements Initializable {
	
	Scene sc;
	Parent root;
	
	@FXML public ChoiceBox<String> chBox = new ChoiceBox<String>();
	@FXML private Button back = new Button();
	@FXML private Button update = new Button();
	@FXML private Button select = new Button();
	@FXML private Label label = new Label();
	@FXML private TextField noTickets = new TextField();
		  private int price = 5;	
	
	
	
	
	public void onBackClick()throws IOException{
		
		sc=(Scene) back.getScene();
		root=FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
		sc.setRoot(root);
		
	}
	
	public void onUpdateClick(ActionEvent event) throws IOException{
		
		
		String host="jdbc:mysql://localhost:3306/cinema_ticketsystem_db";
		try{
			Connection myConn = DriverManager.getConnection(host, "root", "volimnebo6!r");
			PreparedStatement statement = myConn.prepareStatement("SELECT title FROM movie");
			ResultSet result = statement.executeQuery();
			
			while(result.next()){
				
				chBox.getItems().add(result.getString("title"));
				
			}
			
			
		}
		catch(Exception e){
			
		}
			
	}
	
	public void onSelectClick() throws IOException{
		
		label.setText("You have purchased "+noTickets.getText()+" tickets.\nTotal of "+(Integer.parseInt(noTickets.getText())*price)+" BAM");
		
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
