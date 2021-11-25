package model;

import java.util.HashMap;

public class MainModel {
	LinkList<Medico> medicos;
	LinkList<Especialidade> especialidades;
	Sessao sessao;
	Administrador admin;
	HashMap<String,Pessoa> usuario;
	
	public Administrador getAdmin() {
		return admin;
	}

	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}

	public HashMap<String, Pessoa> getUsuario() {
		return usuario;
	}

	public void setUsuario(HashMap<String, Pessoa> usuario) {
		this.usuario = usuario;
	}

	public MainModel() {
		medicos = new LinkList<Medico>();
		especialidades = new LinkList<Especialidade>();
		admin = new Administrador();
		admin.setSenha("admin");
		admin.setLogin("admin");
		
	}
	
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
	
	public boolean autenticar(String cpf, String senha) {
		if(cpf.equals(admin.getLogin())&&senha.equals(admin.getSenha())){
			return true;
		}else {
			return false;
		}
	}

}
