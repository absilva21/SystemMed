package model;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class Persistencia {
	MainModel data;
	
	public void save() throws FileNotFoundException {
		FileOutputStream arq = new FileOutputStream("/med.bat");
		DataOutputStream gravarArq = new DataOutputStream(arq);
		LinkList<Medico> n = data.getMedicos();
		
		
	}
	
}
