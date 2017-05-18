package application;
	
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import pokeObjects.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Polygon;


public class Main extends Application {
	
	public int PLAYERCOUNT=0;

	
	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Board.fxml"));
			//AnchorPane root = fxmlLoader.load(getClass().getResource("Board.fxml"));
			BoardController boardController = (BoardController) fxmlLoader.getController();
			fxmlLoader.setController(boardController);
			AnchorPane root = fxmlLoader.load();

			
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);

			
	        Player player1 = new Player(1,157,649);
	        root.getChildren().add(player1);
	        
	        //to test calling methods from boardcontroller
//	        boardController.sayHi();
//	        System.out.println( boardController.getSpotX(1));
//	        System.out.println( boardController.getSpotX(2));
//	        System.out.println( boardController.getSpotX(3));

			
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			root.setOnMouseClicked(new EventHandler<MouseEvent>(){
				@Override
				public void handle(MouseEvent event){
					event.consume();
					String areaClicked = event.getTarget().toString();
					String[] objectClicked = areaClicked.split("\\s|,|\\[|\\]|=");
					System.out.println("Mouse clicked detected: " + objectClicked[0] + " " + objectClicked[2]);
					
<<<<<<< HEAD
					//if circle spot
					if(objectClicked[2].charAt(0)=='s'&&objectClicked[0].charAt(0)=='C'){
=======
					
					if(objectClicked[2].charAt(0)=='s'){
>>>>>>> parent of 030559b... Mouse Transparent Text/Pokecircles
						int spotIdNumber = Integer.parseInt(objectClicked[2].replaceAll("[^0-9]", ""));
						System.out.println("Spot Clicked");
						player1.setX(boardController.getSpotX(spotIdNumber));
						player1.setY(boardController.getSpotY(spotIdNumber));
					}
					
<<<<<<< HEAD
					//if rectangle spot
					if(objectClicked[2].charAt(0)=='s'&&objectClicked[0].charAt(0)=='R'){
						int spotIdNumber = Integer.parseInt(objectClicked[2].replaceAll("[^0-9]", ""));
						System.out.println("Spot Clicked");
						player1.setX(boardController.getCitySpotX(spotIdNumber));
						player1.setY(boardController.getCitySpotY(spotIdNumber));
					}
=======
					
					
					//System.out.println(boardController.spots[1].getAction());

					
					//player1.setX(boardController.spots[1].getCircle().getCenterX());
					//player1.setY(boardController.spots[1].getCircle().getCenterY());
					
>>>>>>> parent of 030559b... Mouse Transparent Text/Pokecircles
					
				}
			});
		
			
			
			
			
			
			
			
			primaryStage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		 new Thread( () -> {
		      try {
		        // Create a server socket
		    	System.out.println("Opening server socket");
		        ServerSocket serverSocket = new ServerSocket(8022);
		        //Platform.runLater(() ->textArea.appendText("Server started at " + new Date() + '\n'));
		  
		        // Listen for a connection request
		        Socket socket = serverSocket.accept();

		  
		        // Create data input and output streams
		        ObjectInputStream inputFromClient = new ObjectInputStream(socket.getInputStream());
		        ObjectOutputStream outputToClient = new ObjectOutputStream(socket.getOutputStream());
		  
		        while (true) {

			        //Object object = inputFromClient.readObject();
			        //System.out.println(object);

		        	
		        }
		      }
		      catch(IOException ex) {
		        ex.printStackTrace();
		      } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		    }).start();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
