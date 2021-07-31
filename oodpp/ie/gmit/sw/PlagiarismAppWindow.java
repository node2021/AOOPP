package ie.gmit.sw;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class PlagiarismAppWindow extends Application{

	@Override
    public void start(Stage stage) throws Exception {
    	stage.setTitle("GMIT - B.Sc. in Computing (Software Development) - OODPP Repeat Assignment 2021");
		stage.setWidth(800);
		stage.setHeight(600);
    	
		VBox box = new VBox();
		Scene scene = new Scene(box);
		stage.setScene(scene);

		//Display the window
		stage.show();
		stage.centerOnScreen();
	}
}