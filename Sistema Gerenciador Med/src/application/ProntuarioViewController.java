package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.SubScene;
import javafx.scene.layout.AnchorPane;

public class ProntuarioViewController {
	@FXML
	SubScene sub;
	
	@FXML
	private void initialize() throws IOException {
		AnchorPane form = (AnchorPane)FXMLLoader.load(getClass().getResource("areaText.fxml"));
		sub.setRoot(form);
	}
}
