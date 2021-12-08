package application;

import java.time.LocalDate;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import model.Medico;
import model.Paciente;

public class AgendaMarcaController {
	@FXML
	Label dr;
	
	@FXML
	ListView<Paciente> list;
	
	@FXML
	ComboBox<LocalDate> datas;
	
	static Medico x;
	
	@FXML
	private void initialize() {
		x = ListaMedicoController.getS();
		dr.setText(x.toString());
	}
	
}
