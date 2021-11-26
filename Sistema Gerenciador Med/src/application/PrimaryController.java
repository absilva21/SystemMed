package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import model.Pessoa;

public class PrimaryController {
	
	@FXML
	TextField cpf;
	
	@FXML
	Label erro;
	
	@FXML
	void OnActionVoltarLogin(ActionEvent event) throws IOException {
		VBox form = (VBox)FXMLLoader.load(getClass().getResource("login.fxml"));
    	Scene sceneform = new Scene(form,800,600);
    	Main.aux.setScene(sceneform);
	}
	
	@FXML
	void cadasPass(ActionEvent event) throws IOException {
		boolean isSet = Main.main.BuscarUser(cpf.getText());
		if(isSet) {
			Pessoa x = Main.main.getUsuario().get(cpf.getText());
			Main.refPessoa = x;
			AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("PrimeiroAcessoSenha.fxml"));
	    	Scene sceneform = new Scene(form,800,600);
	    	Main.aux.setScene(sceneform);
		}else {
			erro.setVisible(true);
		}
	}
	
}
