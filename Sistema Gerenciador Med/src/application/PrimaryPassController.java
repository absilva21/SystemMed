package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.VBox;
import model.Atendente;
import model.Medico;
import model.Pessoa;

public class PrimaryPassController {
	@FXML
	Label erro;
	
	@FXML
	TextField pass;
	
	@FXML
	void salvar(ActionEvent event) throws IOException {
		if(pass.getText().length()==6) {
			Pessoa x = Main.refPessoa;
			if(x instanceof Medico) {
				Medico y = (Medico) x;
				y.setSenha(pass.getText());
			}else {
				Atendente z = (Atendente) x; 
				z.setSenha(pass.getText());
			}
			
			VBox form = (VBox)FXMLLoader.load(getClass().getResource("login.fxml"));
	    	Scene sceneform = new Scene(form,800,600);
	    	Main.aux.setScene(sceneform);
		}else {
			erro.setVisible(true);
		}
	}
}
