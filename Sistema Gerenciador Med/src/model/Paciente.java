package model;

public class Paciente extends Pessoa {
	Prontuario prontuario;
	
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
