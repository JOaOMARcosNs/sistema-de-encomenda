package br.com.classes;

public class Remetente extends Cliente{

	public Remetente(int id,String nomeCompleto, String email, String telefone, String cpf, String rg, Endereco endereco,
			char sexo) {
		super(nomeCompleto, email, telefone, cpf, rg, endereco, sexo, id);
		
	}

}
