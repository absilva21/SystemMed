package application;

import java.io.IOException;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import model.Dia;
import model.LinkList;
import model.Tarefa;

public class AgendaController {
	
	@FXML
	ListView<Tarefa> list;
	
	@FXML
	ComboBox<String> datas;
	
	@FXML
	private void initialize() {
		
		datas.getSelectionModel().selectedIndexProperty().addListener((ChangeListener<? super Number>) new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				// TODO Auto-generated method stub
				
				 Dia x = Main.agenda.getDias().get(datas.getValue());
				 LinkList<Tarefa> tarefas = x.getTarefas();
				 tarefas.resetIndex();
				 Tarefa a = tarefas.next();
				 ObservableList<Tarefa> itens = FXCollections.observableArrayList();
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
		
		Object[] keys =  Main.agenda.keys();
		if(keys.length!=0) {
			for(int i = 0;i<keys.length;i++) {
				datas.getItems().add((String) keys[i]);
			}
		}
	}
	
	@FXML
	void add(ActionEvent e) throws IOException{
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("formTarefa.fxml"));
		Scene scene = new Scene(root,800,600);
		Main.scen.setScene(scene);
	}
}
