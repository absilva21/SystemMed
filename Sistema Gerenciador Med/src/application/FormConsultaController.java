package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class FormConsultaController {
	
	@FXML
	void voltar(ActionEvent e) throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("agenda.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
	}
	
	
	@FXML
	void salvar(ActionEvent e) {
		
	}
}
