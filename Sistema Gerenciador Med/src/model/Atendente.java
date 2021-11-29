package model;

public class Atendente extends Pessoa {
	String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Atendente() {
		super();
	}
	
	@Override
	public String toString() {
		return super.getName()+" "+super.getSobrenome();
	}
}
