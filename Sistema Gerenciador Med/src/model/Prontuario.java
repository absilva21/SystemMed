package model;

public class Prontuario {
	

	Pessoa identificacao;
	String anamnese;
	String exameFisico;
	String hiposteseDiagnostico;
	String definicaoDiagnostico;
	String tramento;
	
	public String getAnamnese() {
		return anamnese;
	}

	public void setAnamnese(String anamnese) {
		this.anamnese = anamnese;
	}

	public String getExameFisico() {
		return exameFisico;
	}

	public void setExameFisico(String exameFisico) {
		this.exameFisico = exameFisico;
	}

	public String getHiposteseDiagnostico() {
		return hiposteseDiagnostico;
	}

	public void setHiposteseDiagnostico(String hiposteseDiagnostico) {
		this.hiposteseDiagnostico = hiposteseDiagnostico;
	}

	public String getDefinicaoDiagnostico() {
		return definicaoDiagnostico;
	}

	public void setDefinicaoDiagnostico(String definicaoDiagnostico) {
		this.definicaoDiagnostico = definicaoDiagnostico;
	}

	public String getTramento() {
		return tramento;
	}

	public void setTramento(String tramento) {
		this.tramento = tramento;
	}

	public Pessoa getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(Pessoa identificacao) {
		this.identificacao = identificacao;
	}
}
