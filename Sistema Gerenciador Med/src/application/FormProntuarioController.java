package application;

import java.io.IOException;
import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import model.Endereco;
import model.LinkList;
import model.Paciente;
import model.Pessoa;
import model.Prontuario;

public class FormProntuarioController {
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
	DatePicker nas;
	
	@FXML
	void initialize() {
		ObservableList<String> options = FXCollections.observableArrayList("RR","AP","AM","PA","AC","RO","TO","MA","PI","CE","RN","PB","PE","AL","SE","BA","MT","DF","GO","MS","MG","ES","RJ","SP","PR","SC","RS");
		esta.setItems(options);
	}
	
	
	@FXML
	void save(ActionEvent e) throws IOException {
		Paciente n = new Paciente();
		Prontuario n2 = new Prontuario();
		n.setName(name.getText());
		n.setSobrenome(sobreName.getText());
		n.setCpf(cpf.getText());
		n.setRg(rg.getText());
		n.setNascimento(nas.getValue());
		Endereco end = new Endereco();
		end.setNomeLongadouro(longa.getText());
		end.setNumero(num.getText());
		end.setComplemento(comple.getText());
		end.setCidade(city.getText());
		end.setEstado(esta.getValue());
		end.setCep(cep.getText());
		n.setEndereco(end);
		n.setProntuario(n2);
		n2.setIdentificacao(n);
		LinkList<Paciente> list = Main.main.getProntuarios();
		list.add(n);
		HashMap<String,Pessoa> pess = Main.main.getUsuario();
		pess.put(cpf.getText(), n);
		
		BorderPane form = (BorderPane)FXMLLoader.load(getClass().getResource("listaProntuarios.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
		
	}
	
	@FXML
	void voltar(ActionEvent e) throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("inicioAtendente.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
	}
	
}
