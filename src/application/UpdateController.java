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

public class UpdateController implements Initializable{

	@FXML private Button updateMovies = new Button();
	@FXML private Button updateVenues = new Button();
	@FXML private Button updateUsers = new Button();
	@FXML private Button back = new Button();
	
	Parent root;
	Scene sc;
	
	
	public void onUpdateMoviesClick(ActionEvent event) throws IOException{
		
		sc=(Scene) updateMovies.getScene();
		root=FXMLLoader.load(getClass().getResource("UpdateMovies.fxml"));
		sc.setRoot(root);
		
	}
	
	public void onUpdateVenuesClick(ActionEvent event) throws IOException{
			
			sc=(Scene) updateVenues.getScene();
			root=FXMLLoader.load(getClass().getResource("UpdateVenues.fxml"));
			sc.setRoot(root);
			
		}
	
	public void onUpdateUsersClick(ActionEvent event) throws IOException{
		
		sc=(Scene) updateUsers.getScene();
		root=FXMLLoader.load(getClass().getResource("UpdateUsers.fxml"));
		sc.setRoot(root);
	
	}
	
	public void onBackClick(ActionEvent event) throws IOException{
			
			sc=(Scene) back.getScene();
			root=FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
			sc.setRoot(root);
			
		}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}
