package application;


import javafx.application.Application; 
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;


/* due to mine and the rest of my teams incompetence this project was not finished in time and it's only 
 * a third finished, it's missing a database which is essential for making the program work, I only made
 * a skeleton for the application. As sad as it is to admit, we failed.
 */


public class Main extends Application {
	
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
      
        Scene scene = new Scene(root,800,600);
        primaryStage.setTitle("Cinema Ticket System");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.show();
        
    }
    	
    
    public static void main(String[] args) {
        launch(args);
    }

}