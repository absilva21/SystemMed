package application;

import java.io.IOException;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import model.Medico;
import model.Paciente;

public class AgendaMarcaController {
	@FXML
	Label dr;
	
	@FXML
	ListView<Paciente> list;
	
	@FXML
	ComboBox<LocalDate> datas;
	
	static Medico x;
	
	@FXML
	private void initialize() {
		x = ListaMedicoController.getS();
		dr.setText(x.toString());
	}
	
	@FXML
	void volta(ActionEvent e) throws IOException {
		BorderPane form = (BorderPane)FXMLLoader.load(getClass().getResource("listaMedicos.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
	}
	
	@FXML
	void add(ActionEvent e) throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("formConsulta.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
	}
	
}
