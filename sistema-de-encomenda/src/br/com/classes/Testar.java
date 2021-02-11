package br.com.classes;

public class Testar {

	public static void main(String[] args) {
		Endereco end = new Endereco("A", 50, "B", "X", "tttt", "BA"); 
		Remetente r1 = new Remetente("JM", "JM@", "00000", "0000", "00", end , 'M', 2, 1);  
		Encomenda e1 = new Encomenda(20, 30, 30, r1); 
		
		System.out.println(e1.getRemetente().getNomeCompleto());
	}

}
