package br.com.classes;

public class Testar {

	public static void main(String[] args) {
		Endereco endereco = new Endereco(1, "a", 1, "00", "00", "00", "00");
		Cliente c1 = new Cliente("Jm", "00", "00", "00", "00", endereco , 'M', 1);
		Remetente remetente = new Remetente(c1);
		System.out.println(remetente.getCliente().getEndereco().getId());
		
		
	}

}
