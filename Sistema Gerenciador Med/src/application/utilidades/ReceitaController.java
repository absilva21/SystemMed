package application;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.print.PrinterJob;
public class ReceitaController {
	
	@FXML
	Label pres;
	
	@FXML
	Label pa;
	

	
	@FXML
	private void initialize() {
		pres.setText(Main.prescricao);
		pa.setText(Main.paciente);
	}
	
	/*@FXML
	void print(ActionEvent e) throws IOException{
		BorderPane receita = (BorderPane)FXMLLoader.load(getClass().getResource("receitaLayout.fxml"));
		textImpress.setVisible(false);
		impress.setVisible(false);
		prin.setVisible(false);
	    PrinterJob job = PrinterJob.createPrinterJob();
	    if(job != null) {
	        boolean success = job.printPage(receita);
	        if (success) {
	            job.endJob();
	            System.out.println("ok");
	        }else {
	        	System.out.println("erro");
	        		
	        }
	        
	    }
	}*/
}
