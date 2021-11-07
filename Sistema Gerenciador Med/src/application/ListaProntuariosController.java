package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class ListaProntuariosController {
	@FXML
	void voltarHome(ActionEvent event) throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("inicioAtendente.fxml"));
		Scene sceneform = new Scene(form,800,600);
    	Main.aux.setScene(sceneform);
	}
}
