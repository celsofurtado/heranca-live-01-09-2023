package br.com.fiap.heranca.model;

public abstract class Pessoa {
	
	private String nome;
	private String email;
	private int idade;
	private Endereco endereco;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome.toUpperCase();
	}
	
	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("A idade deve ser maior que 0. Vou considerar 1!!");
			this.idade = 1;
		} else {
			this.idade = idade;
		}
		
	}
	
	public int getIdade() {
		return idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public abstract void exibirDados();
	
}
