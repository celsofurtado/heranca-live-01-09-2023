package br.com.fiap.heranca.model;

public class Cliente extends Pessoa {

	@Override
	public void exibirDados() {
		System.out.println("DADOS DO CLIENTE");
		System.out.println("Nome: " + super.getNome());
		System.out.println("E-mail: " + super.getEmail());
		System.out.println("Idade: " + super.getIdade());
		System.out.println("Logradouro: " + super.getEndereco().getLogradouro());
		System.out.println("Cidade: " + super.getEndereco().getCidade());
		System.out.println("--------------------");
	}
	
	

}
