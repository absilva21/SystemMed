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
import javafx.scene.layout.VBox;
import model.LinkList;
import model.Medico;

public class ListaMedicoController {
	@FXML
	ListView<Medico> lista;
	
	@FXML
	private void initialize() {
		LinkList<Medico> list = Main.main.getMedicos();
		list.resetIndex();
		Medico x =(Medico)list.next();
		if(x!=null) {
			lista.getItems().add(x);
		}
		
		while(list.getIndex()!=null) {
			x = (Medico)list.next();
			if(x!=null) {
				lista.getItems().add(x);
			}
		}
	}
	
	@FXML
	void voltarHome(ActionEvent event) throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("inicioAtendente.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
	}
	
	@FXML
	void cadastro(ActionEvent event)throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("formMedicos.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
	}
}
