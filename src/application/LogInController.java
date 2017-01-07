package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInController implements Initializable {

	@FXML private Label loginMessageLabel = new Label();
	@FXML private Button loginButton = new Button();
	@FXML private TextField nameInput = new TextField();
	@FXML private PasswordField passwordInput = new PasswordField();
	private String password = "admin";
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void showMessageOnLogIn(ActionEvent event){
    	
    	if(nameInput.getText().equals("admin") && passwordInput.getText().equals(password)){
    		loginMessageLabel.setText("You've successfully Logedin!");
    	}
    }
}

	
