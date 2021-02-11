package br.com.classes;

public class Funcionario extends Pessoa{
	private double salario;
	private String cargo;
	private String setor;
	private String carteiraTrabalho;
	public Funcionario(String nomeCompleto, String email, String telefone, String cpf, String rg, Endereco endereco,
			char sexo, int id, double salario, String cargo, String setor, String carteiraTrabalho) {
		super(nomeCompleto, email, telefone, cpf, rg, endereco, sexo, id);
		this.salario = salario;
		this.cargo = cargo;
		this.setor = setor;
		this.carteiraTrabalho = carteiraTrabalho;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}
	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	
	
}
