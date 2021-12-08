package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class AgendaController {
	
	
	@FXML
	void exit(ActionEvent e) throws IOException {
		VBox form = (VBox)FXMLLoader.load(getClass().getResource("login.fxml"));
    	Scene sceneform = new Scene(form,800,600);
    	Main.aux.setScene(sceneform);
	}
}
