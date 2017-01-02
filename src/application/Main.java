package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application; 
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.control.*;


public class Main extends Application {
	

	public Button loginButton = new Button();
	public TextField nameInput = new TextField();
	public PasswordField passwordInput = new PasswordField();
	public String password = "admin";
	
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
      
        primaryStage.setTitle("Cinema Ticket System");
        primaryStage.setScene(new Scene(root,800,600));
        primaryStage.show();
        
    }
    	
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void onClickLoginButton(ActionEvent event){
    	
    	if(nameInput.getText().equals("admin") && passwordInput.getText().equals(password)){
    		System.out.println("You've successfully loged in!");
    	}
    }

}