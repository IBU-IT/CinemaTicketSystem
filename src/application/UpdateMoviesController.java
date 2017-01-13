package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class UpdateMoviesController implements Initializable {

	Scene sc;
	Parent root;
	@FXML private Button back = new Button();
	@FXML private Button addMovie = new Button();
	@FXML private TextField title = new TextField();
	@FXML private TextField director = new TextField();
	@FXML private TextArea description = new TextArea();
	@FXML private Label message = new Label();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
public void onBackClick(ActionEvent event) throws IOException{
		
		sc=(Scene) back.getScene();
		root=FXMLLoader.load(getClass().getResource("Update.fxml"));
		sc.setRoot(root);
		
	}
public void onAddMovieClick(){
	
	String host="jdbc:mysql://localhost:3306/cinema_ticketsystem_db"; 
	
	try{
		
		Connection myConn = DriverManager.getConnection(host, "root", "volimnebo6!r");
		PreparedStatement myStatement = myConn.prepareStatement("INSERT INTO movie (`title`, `director`, `description`) VALUES (?,?,?)");
		myStatement.setString(1, title.getText());
		myStatement.setString(2, director.getText());
		myStatement.setString(3, description.getText());
		
		myStatement.executeUpdate();
		message.setText("You've succesfully added a Movie!");
		
	}
	catch(Exception e){
		
	}
	
}
	
}
