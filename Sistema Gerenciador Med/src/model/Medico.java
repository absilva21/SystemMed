package model;

public class Medico extends Pessoa{
	String registro;
	String orgaoRegistrador;
	Agenda agenda;
	Especialidade especialidade;
	Especialidade subEspecialidade;
	String senha;
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Medico() {
		super();
	}
	@Override
	public
	String toString(){
		return "DR(a)."+super.getName()+" "+super.getSobrenome();
	}
	
	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getOrgaoRegistrador() {
		return orgaoRegistrador;
	}

	public void setOrgaoRegistrador(String orgaoRegistrador) {
		this.orgaoRegistrador = orgaoRegistrador;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public Especialidade getSubEspecialidade() {
		return subEspecialidade;
	}

	public void setSubEspecialidade(Especialidade subEspecialidade) {
		this.subEspecialidade = subEspecialidade;
	}



	
}
