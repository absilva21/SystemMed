package model;

public class MainModel {
	LinkList<Medico> medicos;
	LinkList<Especialidade> especialidades;
	Sessao sessao;
	public LinkList<Medico> getMedicos() {
		return medicos;
	}
	public void setMedicos(LinkList<Medico> medicos) {
		this.medicos = medicos;
	}
	public LinkList<Especialidade> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(LinkList<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}
	public Sessao getSessao() {
		return sessao;
	}
	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}
	
	public void cadastrarMedico(Medico m) {
		medicos.add(m);
	}

}
