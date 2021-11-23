package application;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class SampleController {
	@FXML
	TextField cpf;
	
	@FXML
	PasswordField pass;
	
	@FXML
	Label erro;
	
	@FXML
	void onActionPrimary(ActionEvent event) throws IOException {
	
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("primeiroAcesso.fxml"));
    	Scene sceneform = new Scene(form,800,600);
    	Main.aux.setScene(sceneform);
	}
	
	
	
	@FXML
	void onActionEntrar(ActionEvent event) throws IOException{
		boolean vali = Main.main.autenticar(cpf.getText(), pass.getText());
		if(vali) {
			AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("inicioAtendente.fxml"));
			Scene sceneform = new Scene(form,800,600);
	    	Main.aux.setScene(sceneform);
		}else {
			erro.setVisible(true);
		}
				
	
	}
	
	
	
}
