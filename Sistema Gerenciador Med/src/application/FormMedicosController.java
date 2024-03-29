package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import model.Especialidade;
import model.LinkList;
import model.Medico;

public class FormMedicosController {
	
	@FXML
	TextField tel;
	
	@FXML
	ComboBox<Especialidade> esp; 
	
	@FXML                       
	ComboBox<Especialidade> subEsp;
	@FXML
	TextField name;
	
	@FXML
	TextField sobreName;
	
	@FXML
	TextField cpf;
	
	@FXML
	TextField rg;
	
	@FXML
	TextField longa;
	
	@FXML
	TextField num;
	
	@FXML
	TextField comple;
	
	@FXML
	TextField bairro;
	
	@FXML
	TextField city;
	
	@FXML
	ComboBox<String> esta;
	
	@FXML
	TextField cep;
	
	@FXML
	TextField crm;

	
	@FXML
	private void initialize() {
		ObservableList<String> options = FXCollections.observableArrayList("RR","AP","AM","PA","AC","RO","TO","MA","PI","CE","RN","PB","PE","AL","SE","BA","MT","DF","GO","MS","MG","ES","RJ","SP","PR","SC","RS");
		esta.setItems(options);
		LinkList<Especialidade> list = Main.main.getEspecialidades();
		list.resetIndex();
		Especialidade x = list.next();
		if(x!=null) {
			esp.getItems().add(x);
			subEsp.getItems().add(x);
		}
		
		while(list.getIndex()!=null) {
			x = list.next();
			
			if(x!=null) {
				esp.getItems().add(x);
				subEsp.getItems().add(x);
			}
		}
	}
	
	@FXML
	void voltarLista(ActionEvent event) throws IOException {
		BorderPane form = (BorderPane)FXMLLoader.load(getClass().getResource("listaMedicos.fxml"));
		Scene sceneform = new Scene(form,800,600);
    	Main.aux.setScene(sceneform);
		
	}
	

	
	@FXML
	void save(ActionEvent event) throws IOException {
		Medico n = new Medico();
		n.setName(name.getText());
		n.setSobrenome(sobreName.getText());
		n.setCpf(cpf.getText());
		n.setRg(rg.getText());
		n.getEndereco().setNomeLongadouro(longa.getText());
		n.getEndereco().setNumero(num.getText());
		n.getEndereco().setComplemento(comple.getText());
		n.getEndereco().setBairro(bairro.getText());
		n.getEndereco().setCidade(city.getText());
		n.getEndereco().setEstado(esta.getValue());
		n.getEndereco().setCep(cep.getText());
		n.setRegistro(crm.getText());
		n.setEspecialidade(esp.getValue());
		n.setSubEspecialidade(subEsp.getValue());
		n.setTelefone(tel.getText());
		
		Main.main.getUsuario().put(cpf.getText(), n);
	
		Main.main.getMedicos().add(n);
		BorderPane form = (BorderPane)FXMLLoader.load(getClass().getResource("listaMedicos.fxml"));
		Scene sceneform = new Scene(form,800,600);
	
    	Main.aux.setScene(sceneform);
		
	}
	
	
}
