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

public class ListaProntuariosController {
	
	@FXML
	ListView<String> lista;
	
	@FXML
	private void initialize() {
		ObservableList<String> items =FXCollections.observableArrayList("Alisson","fulano");
		lista.setItems(items);
	}
	
	@FXML
	void voltarHome(ActionEvent event) throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("inicioAtendente.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
	}
}
