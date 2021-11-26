package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class InicioAtendenteController {
	
	@FXML
	Button med;
	
	@FXML
	Button prontuarios;
	
	@FXML
	Button addAten;
	
	
	@FXML
	private void initialize() {
		int n = Main.main.getSessao().getTypeUser();
		
		switch(n) {
		case 1:
			addAten.setVisible(false);
		}
	}
	
	@FXML
	void prontuOnAction(ActionEvent event) throws IOException {
		BorderPane form = (BorderPane)FXMLLoader.load(getClass().getResource("listaProntuarios.fxml"));
		Scene sceneform = new Scene(form,800,600);
    	Main.aux.setScene(sceneform);
	}
	
	@FXML
	void onMouseSair(ActionEvent event)throws IOException{
		VBox form = (VBox)FXMLLoader.load(getClass().getResource("login.fxml"));
    	Scene sceneform = new Scene(form,800,600);
    	Main.aux.setScene(sceneform);
	}
	
	@FXML
	void medicos(ActionEvent event)throws IOException{
		BorderPane form = (BorderPane)FXMLLoader.load(getClass().getResource("listaMedicos.fxml"));
		Scene sceneform = new Scene(form,800,600);
    	Main.aux.setScene(sceneform);
	}
	
}
