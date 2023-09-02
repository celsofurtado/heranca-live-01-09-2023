package br.com.fiap.heranca;

import br.com.fiap.heranca.model.Cliente;
import br.com.fiap.heranca.model.Endereco;
import br.com.fiap.heranca.model.Funcionario;
import br.com.fiap.heranca.model.Pessoa;

public class Main {

	public static void main(String[] args) {
		
//		Pessoa usuario = new Pessoa();
//		usuario.setNome("maria da silva");
//		usuario.setIdade(34);
//		usuario.exibirDados();
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Pedro Oliveira");
		cliente1.setIdade(23);
		cliente1.setEmail("pedro@uol.com.br");
		cliente1.setEndereco(new Endereco("Rua Independencia, 400", "Ribeirão Preto"));
		cliente1.exibirDados();
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Fabiana Moreira");
		funcionario1.setIdade(42);
		funcionario1.setEmail("fabi@terra.com.br");
		funcionario1.setDepartamento("Tecnologia");
		funcionario1.setSalario(12900.76);
		funcionario1.exibirDados();
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Adriana Gomes");
		funcionario2.setIdade(28);
		funcionario2.setEmail("adria@terra.com.br");
		funcionario2.setDepartamento("Financeiro");
		funcionario2.setSalario(9886.99);
		funcionario2.exibirDados();

	}

}










