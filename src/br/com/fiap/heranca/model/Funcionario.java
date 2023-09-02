package br.com.fiap.heranca.model;

public class Funcionario extends Pessoa {

	private double salario;
	private String departamento;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Dados do Funcionário");
		System.out.println("Nome: " + super.getNome());
		System.out.println("E-mail: " + super.getEmail());
		System.out.println("Idade: " + super.getIdade());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("------------------------");
	}
	
	

}
