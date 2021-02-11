package br.com.classes;

public class Caminhao extends Veiculo {
	private int quantidadeEixo;
	
	public Caminhao(int id,String fabricanteString, String modelo, String marca, String placa, String cor,
			String ano,
			int quantidadeEixo, String numeroChassi) {
		super(id,fabricanteString, modelo, marca, placa, cor, ano, numeroChassi);
		this.quantidadeEixo = quantidadeEixo;
		
	}
	public int getQuantidadeEixo() {
		return quantidadeEixo;
	}
	public void setQuantidadeEixo(int quantidadeEixo) {
		this.quantidadeEixo = quantidadeEixo;
	}
}
