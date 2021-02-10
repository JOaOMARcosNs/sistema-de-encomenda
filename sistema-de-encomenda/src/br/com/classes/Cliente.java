package br.com.classes;

public class Cliente extends Pessoa{
	private int codigoCliente;

	public Cliente(String nome, String email, String tel, String cpf, String rg, Endereco end, char sx, int cod) {
		super(nome, email, tel, cpf, rg, end, sx);
		this.codigoCliente = cod;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
}
