package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import model.Atendente;
import model.LinkList;
import model.Medico;

public class ListaAtendenController {
	
	@FXML
	ListView<Atendente> lista;
	
	@FXML
	private void initialize() {
		LinkList<Atendente> list = Main.main.getAtendentes();
		list.resetIndex();
		Atendente x =(Atendente)list.next();
		if(x!=null) {
			lista.getItems().add(x);
		}
		
		while(list.getIndex()!=null) {
			x = (Atendente)list.next();
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
	void add(ActionEvent event)throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("formAtend.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
	}
}
