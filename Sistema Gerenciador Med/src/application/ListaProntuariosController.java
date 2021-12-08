package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import model.LinkList;
import model.Paciente;

public class ListaProntuariosController {
	
	@FXML
	ListView<Paciente> lista;
	
	@FXML
	private void initialize() {
		LinkList<Paciente> list = Main.main.getProntuarios();
		list.resetIndex();
		Paciente x =(Paciente) list.next();
		if(x!=null) {
			lista.getItems().add(x);
		}
		
		while(list.getIndex()!=null) {
			x =(Paciente) list.next();
			if(x!=null) {
				lista.getItems().add(x);
			}
		}
	}
	
	@FXML
	void add(ActionEvent event)throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("formProntuario.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
	}
	
	@FXML
	void voltarHome(ActionEvent event) throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("inicioAtendente.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
	}
}
