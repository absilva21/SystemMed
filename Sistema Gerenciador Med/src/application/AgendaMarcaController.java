package application;

import java.io.IOException;
import java.time.LocalDate;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import model.Dia;
import model.LinkList;
import model.Medico;
import model.Paciente;
import javafx.collections.FXCollections;

public class AgendaMarcaController {
	@FXML
	Label dr;
	
	@FXML
	ListView<Paciente> list;
	
	@FXML
	ComboBox<String> datas;
	
	static Medico x;
	
	@FXML
	private void initialize() {
		x = ListaMedicoController.getS();
		dr.setText(x.toString());
		
		datas.getSelectionModel().selectedIndexProperty().addListener((ChangeListener<? super Number>) new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				// TODO Auto-generated method stub
				
				 Dia n = x.getAgenda().getDias().get(datas.getValue());
				 LinkList<Paciente> tarefas = n.getPacientes();
				 tarefas.resetIndex();
				 Paciente a = tarefas.next();
				 ObservableList<Paciente> itens = FXCollections.observableArrayList();
				 if(a!=null) {
					 itens.add(a);
				 }
				 
				 while(tarefas.getIndex()!=null) {
					 a = tarefas.next();
					 if(a!=null) {
						 itens.add(a);
					 }
					 
				 }
				 
				 list.setItems(itens);
			}
		});
		
		Object[] keys =  x.getAgenda().keys();
		if(keys.length!=0) {
			for(int i = 0;i<keys.length;i++) {
				datas.getItems().add((String) keys[i]);
			}
		}
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
