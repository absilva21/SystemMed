package model;

import java.time.LocalDate;

public class Dia {
	
	public Dia() {
		pacientes = new LinkList<Paciente>();
	}
	
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LinkList<Paciente> getPacientes() {
		return pacientes;
	}
	public void setPacientes(LinkList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}


	LocalDate data;
	LinkList<Paciente> pacientes;
}
