package br.com.classes;

public class Remetente {
	private Cliente cliente;

	public Remetente(Cliente cliente) {
		super();
		this.cliente = cliente;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
