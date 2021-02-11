package br.com.classes;

public class Destinatario extends Pessoa{
	private int id;
	
	public Destinatario(String nomeCompleto, String email, String telefone, String cpf, String rg, Endereco endereco,
			char sexo, int id) {
		super(nomeCompleto, email, telefone, cpf, rg, endereco, sexo);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
}
