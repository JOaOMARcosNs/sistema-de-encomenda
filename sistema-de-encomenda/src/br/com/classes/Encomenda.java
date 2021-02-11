package br.com.classes;

public class Encomenda {
	private int id;
	private double peso;
	private double altura;
	private double largura;
	private Remetente remetente;
	
	public Encomenda( int id,double peso, double altura, double largura, Remetente remetente) {
		super();
		this.id = id;
		this.peso = peso;
		this.altura = altura;
		this.largura = largura;
		this.remetente = remetente;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public Remetente getRemetente() {
		return remetente;
	}
	public void setRemetente(Remetente remetente) {
		this.remetente = remetente;
	}

}
