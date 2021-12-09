package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class AreaTextController {
	@FXML
	TextArea text;
	
	@FXML
	private void initialize() {
		text.setText(ProntuarioViewController.text);
	}

}
