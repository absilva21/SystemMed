package application;

import java.io.IOException;
import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Agenda;
import model.Consulta;
import model.Paciente;
import model.Pessoa;

public class FormConsultaController {
	
	@FXML
	TextField cpf;
	
	@FXML
	DatePicker data;
	
	@FXML
	void voltar(ActionEvent e) throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("agenda.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
	}
	
	
	@FXML
	void salvar(ActionEvent e) throws IOException {
		HashMap<String,Pessoa> hash = Main.main.getUsuarios();
		if(hash.containsKey(cpf.getText())){
			Agenda x = AgendaMarcaController.x.getAgenda();
			x.cadastrarTarefa(data.getValue(), (Paciente) hash.get(cpf.getText()));
			Paciente paci = (Paciente) hash.get(cpf.getText());
			Consulta nova = new Consulta();
			nova.setData(data.getValue());
			nova.setPaciente(paci);
			nova.setMedico(AgendaMarcaController.x);
			paci.getProntuario().getConsultas().add(nova);
			
		}
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("agenda.fxml"));
		Scene sceneform = new Scene(form,800,600);
		
    	Main.aux.setScene(sceneform);
		
	}
}
