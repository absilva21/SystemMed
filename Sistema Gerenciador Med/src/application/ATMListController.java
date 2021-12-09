package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import model.Consulta;
import model.LinkList;
import model.Paciente;

public class ATMListController {
	
	@FXML
	Label name;
	
	@FXML
	ListView<Consulta> list;
	
	@FXML
	private void initialize() {
		Paciente x = ATMController.paci;
		name.setText(x.toString());
		LinkList<Consulta> lista = x.getProntuario().getConsultas();
		lista.resetIndex();
		Consulta n = lista.next();
		if(n!=null) {
			lista.add(n);
		}
		
		while(lista.getIndex()!=null) {
			n = lista.next();
			if(n!=null) {
				lista.add(n);
			}
		}
		
	}
	
	
}
