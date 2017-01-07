package application;

import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application; 
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.control.*;


public class Main extends Application {
	

	/*public Button loginButton = new Button();
	public TextField nameInput = new TextField();
	public PasswordField passwordInput = new PasswordField();
	public String password = "admin";*/
	
	
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
      
        primaryStage.setTitle("Cinema Ticket System");
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.show();
        
    }
    	
    
    public static void main(String[] args) {
        launch(args);
    }
    
    /*public void onClickLoginButton(ActionEvent event){
    	
    	if(nameInput.getText().equals("admin") && passwordInput.getText().equals(password)){
    		JOptionPane.showMessageDialog(null, "You've successfully logged in!");
    	}
    }*/

}