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

public class UpdateVenuesController implements Initializable {
		
	Scene sc;
	Parent root;
	@FXML private Button back = new Button();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
public void onBackClick(ActionEvent event) throws IOException{
		
		sc=(Scene) back.getScene();
		root=FXMLLoader.load(getClass().getResource("Update.fxml"));
		sc.setRoot(root);
		
	}
	
}
