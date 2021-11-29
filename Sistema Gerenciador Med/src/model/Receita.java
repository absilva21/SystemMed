package model;

import java.time.LocalDate;

public class Receita {
	String precricao;
	String posologia;
	Medico medico;
	public String getPrecricao() {
		return precricao;
	}
	public void setPrecricao(String precricao) {
		this.precricao = precricao;
	}
	public String getPosologia() {
		return posologia;
	}
	public void setPosologia(String posologia) {
		this.posologia = posologia;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	LocalDate data;
}
