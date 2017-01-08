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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogInController implements Initializable {

	@FXML private Label loginMessageLabel = new Label();
	@FXML private Button loginButton = new Button();
	@FXML private TextField nameInput = new TextField();
	@FXML private PasswordField passwordInput = new PasswordField();
	private String password = "admin";
	
	Parent root;
	Scene sc;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void showMessageOnLogIn(ActionEvent event) throws IOException{
    	
    	if(nameInput.getText().equals("admin") && passwordInput.getText().equals(password)){
    		
    		sc=(Scene) loginButton.getScene();
    		root=FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
    		sc.setRoot(root);
    	}else{
    		
    		loginMessageLabel.setText("The username and/or password you entered is incorrect!");
    		
    	}
    }
}

	
