package model;

public class Sessao {
	int typeUser;
	String name;
	Pessoa user;
	
	public Pessoa getUser() {
		return user;
	}
	public void setUser(Pessoa user) {
		this.user = user;
	}
	public static int getPaciente() {
		return PACIENTE;
	}
	public static int getAdm() {
		return ADM;
	}
	static final int MEDICO = 0;
	static final int ATENDENTE = 1;
	static final int PACIENTE = -1;
	static final int ADM = 2;

	public int getTypeUser() {
		return typeUser;
	}
	public void setTypeUser(int typeUser) {
		this.typeUser = typeUser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getMedico() {
		return MEDICO;
	}
	public static int getAtendente() {
		return ATENDENTE;
	}
}
