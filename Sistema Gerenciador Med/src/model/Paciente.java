package model;

import java.time.LocalDate;

public class Paciente extends Pessoa {
	Prontuario prontuario;
	LocalDate nascimento;
	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Paciente() {
		super();
		prontuario = new Prontuario();
		prontuario.setIdentificacao(this);
	}

	public Prontuario getProntuario() {
		return prontuario;
	}

	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}
	
	@Override
	public String toString() {
		return super.getName()+" "+super.getSobrenome();
	}
}
