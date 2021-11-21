package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import model.Medico;

public class ListaMedicoController {
	@FXML
	ListView lista;
	
	@FXML
	private void initialize() {
		
	}
	
	@FXML
	void cadstro(ActionEvent event)throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("formMedicos.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
	}
}
