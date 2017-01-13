package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainMenuController implements Initializable {

	@FXML private Button updateDatabase = new Button();
	@FXML private Button reserveSeat = new Button();
	@FXML private TextField textField = new TextField();
	@FXML private Button back = new Button();
	@FXML private Button reservation = new Button();
	
	Parent root;
	Scene sc;
	
	public void onUpdateClick(ActionEvent event) throws IOException{
		sc=(Scene) updateDatabase.getScene();
		root=FXMLLoader.load(getClass().getResource("Update.fxml"));
		sc.setRoot(root);
	}
	
	public void onReserveSeatClick(ActionEvent event) throws IOException{
		
		sc=(Scene) back.getScene();
		root=FXMLLoader.load(getClass().getResource("ReserveSeat.fxml"));
		sc.setRoot(root);
		
	}
	
	public void onBackClick(ActionEvent event) throws IOException{
		
		sc=(Scene) back.getScene();
		root=FXMLLoader.load(getClass().getResource("LogIn.fxml"));
		sc.setRoot(root);
		
	}
	
	public void onReservationClick(ActionEvent event) throws IOException{
		
		sc=(Scene) back.getScene();
		root=FXMLLoader.load(getClass().getResource("Reservation.fxml"));
		sc.setRoot(root);
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	
}