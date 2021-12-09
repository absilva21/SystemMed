package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Paciente;

public class ATMController {
	
	static Paciente paci;
	
	@FXML
	TextField cpf;
	
	@FXML
	DatePicker nas;
	
	@FXML
	Label erro;
	
	@FXML
	void go(ActionEvent e) throws IOException {
		
		
		boolean auth = Main.main.autenticar(cpf.getText(), nas.getValue().toString());
		if(auth) {
			paci = (Paciente) Main.main.getUsuarios().get(cpf.getText());
			AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("atmList.fxml"));
			Scene sceneform = new Scene(form,800,600);
	    	Main.atm.setScene(sceneform);
		}else {
			erro.setVisible(true);
		}
	}
	
}
