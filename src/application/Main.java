package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import pokeObjects.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	public int PLAYERCOUNT=0;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {

			Parent root = FXMLLoader.load(getClass().getResource("Board.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);

			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			
			
			
			primaryStage.show();

			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
