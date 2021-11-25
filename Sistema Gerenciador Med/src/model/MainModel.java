package model;

import java.util.HashMap;

public class MainModel {
	LinkList<Medico> medicos;
	LinkList<Especialidade> especialidades;
	Sessao sessao;
	Administrador admin;
	HashMap<String,Pessoa> usuarios;
	
	public Administrador getAdmin() {
		return admin;
	}

	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}

	public HashMap<String, Pessoa> getUsuario() {
		return usuarios;
	}

	public void setUsuario(HashMap<String, Pessoa> usuario) {
		this.usuarios = usuario;
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
		boolean auth = false;
		if(cpf.equals(admin.getLogin())&&senha.equals(admin.getSenha())){
			auth = true;
			sessao = new Sessao();
			this.sessao.setName("admin");
			this.sessao.setTypeUser(Sessao.ADM);
		}else if(usuarios.containsKey(cpf)) {
			Pessoa user = usuarios.get(cpf);
			if(user instanceof Medico) {
				Medico x = (Medico) user;
				auth = senha.equals(x.getSenha());
				this.sessao.setName(user.name);
				this.sessao.setTypeUser(Sessao.MEDICO);
			}else if(user instanceof Atendente) {
				Atendente x = (Atendente) user;
				auth = senha.equals(x.getSenha());
				this.sessao.setName(user.name);
				this.sessao.setTypeUser(Sessao.ATENDENTE);
			}else {
				//autenticação do Paciente no auto Atendimento
			}
		}else {
			auth = false;
		}
		
		return auth;
	}

}
