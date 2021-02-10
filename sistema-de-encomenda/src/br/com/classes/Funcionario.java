package br.com.classes;

public class Funcionario extends Pessoa{
	private double salario;
	private String cargo;
	private String setor;
	private String carteiraTrabalho;
	
	public Funcionario(String nome, String email, String tel, String cpf, String rg, Endereco end, char sx) {
		super(nome, email, tel, cpf, rg, end, sx);
		
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
