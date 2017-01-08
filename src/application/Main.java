package application;


import javafx.application.Application; 
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;



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