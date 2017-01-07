package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainMenuController implements Initializable {

	@FXML private Button addMovie = new Button();
	@FXML private Button reserveSeat = new Button();
	@FXML private TextField textField = new TextField();
	
	public void onAddMovieClick(ActionEvent event){
		
	}
	
	public void onReserveSeatClick(ActionEvent event){
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	
}