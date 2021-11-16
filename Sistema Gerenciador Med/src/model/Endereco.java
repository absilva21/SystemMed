package model;

public class Endereco {
	String nomeLongadouro;
	String numero;
	String complemento;
	String bairro;
	String cidade;
	String estado;
	String cep;
	public String getNomeLongadouro() {
		return nomeLongadouro;
	}
	public void setNomeLongadouro(String nomeLongadouro) {
		this.nomeLongadouro = nomeLongadouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
}
