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
import javafx.scene.control.ToggleButton;

public class ReserveSeatController implements Initializable {

	Scene sc;
	Parent root;
	
	@FXML private Button back = new Button();
	@FXML private ToggleButton seat00 = new ToggleButton();
	@FXML private ToggleButton seat01 = new ToggleButton();
	@FXML private ToggleButton seat02 = new ToggleButton();
	@FXML private ToggleButton seat03 = new ToggleButton();
	@FXML private ToggleButton seat04 = new ToggleButton();
	@FXML private ToggleButton seat10 = new ToggleButton();
	@FXML private ToggleButton seat11 = new ToggleButton();
	@FXML private ToggleButton seat12 = new ToggleButton();
	@FXML private ToggleButton seat13 = new ToggleButton();
	@FXML private ToggleButton seat14 = new ToggleButton();
	@FXML private ToggleButton seat20 = new ToggleButton();
	@FXML private ToggleButton seat21 = new ToggleButton();
	@FXML private ToggleButton seat22 = new ToggleButton();
	@FXML private ToggleButton seat23 = new ToggleButton();
	@FXML private ToggleButton seat24 = new ToggleButton();
	@FXML private ToggleButton seat30 = new ToggleButton();
	@FXML private ToggleButton seat31 = new ToggleButton();
	@FXML private ToggleButton seat32 = new ToggleButton();
	@FXML private ToggleButton seat33 = new ToggleButton();
	@FXML private ToggleButton seat34 = new ToggleButton();
	@FXML private ToggleButton seat40 = new ToggleButton();
	@FXML private ToggleButton seat41 = new ToggleButton();
	@FXML private ToggleButton seat42 = new ToggleButton();
	@FXML private ToggleButton seat43 = new ToggleButton();
	@FXML private ToggleButton seat44 = new ToggleButton();
	
	
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
