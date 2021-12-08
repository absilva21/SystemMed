package application;
import java.io.IOException;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import model.Dia;
import model.LinkList;
import model.Medico;
import model.Paciente;

public class AgendaMedController {
	LocalDate hoje;
	
	@FXML
	ListView<Paciente> list;
	
	@FXML
	private void initialize() {
		Medico dr = (Medico) Main.main.getSessao().getUser();
		hoje = LocalDate.now();
		if(dr.getAgenda().getDias().containsKey(hoje.toString())) {
			Dia y = dr.getAgenda().getDias().get(hoje.toString());
			LinkList<Paciente> listPaci = y.getPacientes();
			listPaci.resetIndex();
			Paciente x = listPaci.next();
			if(x!=null) {
				list.getItems().add(x);
			}
			
			while(listPaci.getIndex()!=null) {
				x = listPaci.next();
				if(x!=null) {
					list.getItems().add(x);
				}
			}
			
			
		}
	}
	
	@FXML
	void exit(ActionEvent e) throws IOException {
		VBox form = (VBox)FXMLLoader.load(getClass().getResource("login.fxml"));
    	Scene sceneform = new Scene(form,800,600);
    	Main.aux.setScene(sceneform);
	}
	
}
