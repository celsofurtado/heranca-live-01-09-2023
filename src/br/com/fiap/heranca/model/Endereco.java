package br.com.fiap.heranca.model;

public class Endereco {

	private String logradouro;
	private String cidade;
	
	public Endereco(String logradouro, String cidade) {
		this.logradouro = logradouro;
		this.cidade = cidade;
	}
	
	public Endereco() {}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
