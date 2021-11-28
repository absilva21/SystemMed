package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.SubScene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;

public class PrintController {
	@FXML
	SubScene printScene;
	
	@FXML
	ComboBox<String> prints;
	
	@FXML
	private void initialize() throws IOException {
		prints.getItems().setAll("Epson","HP");
		BorderPane receita = (BorderPane)FXMLLoader.load(getClass().getResource("receitaLayout.fxml"));
		printScene.setRoot(receita);
		
	}
	
	@FXML
	void print(ActionEvent e) throws IOException{
		
	}
}
