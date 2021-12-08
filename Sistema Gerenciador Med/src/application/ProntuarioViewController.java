package application;

import java.io.IOException;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ProntuarioViewController {
	@FXML
	SubScene sub;
	
	@FXML
	Label idade;
	
	@FXML
	Label name;
	
	@FXML
	void volta(ActionEvent e) throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("agendaMed.fxml"));
		Scene sceneform = new Scene(form,800,600);
		         
    	Main.aux.setScene(sceneform);
	}
	
	@FXML
	private void initialize() throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("areaText.fxml"));
		sub.setRoot(form);
		name.setText(AgendaMedController.paci.toString());
		Integer id = LocalDate.now().getYear()-AgendaMedController.paci.getNascimento().getYear();
		idade.setText(id.toString());
	}
}
