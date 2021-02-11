package br.com.classes;

public class Remetente extends Cliente{
	private int id;

	public Remetente(String nome, String email, String tel, String cpf, String rg, Endereco end, char sx, int cod, int id) {
		super(nome, email, tel, cpf, rg, end, sx, cod);
		this.id = id; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
