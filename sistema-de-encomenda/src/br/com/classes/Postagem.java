package br.com.classes;


import java.util.Date;

public class Postagem {
	private Date dataPostagem;
	private Date previsaoEntregaDate;
	private Encomenda encomenda;
	private Destinatario destinatario;
	public Postagem(Date dataPostagem, Date previsaoEntregaDate, Encomenda encomenda, Destinatario destinatario) {
		super();
		this.dataPostagem = dataPostagem;
		this.previsaoEntregaDate = previsaoEntregaDate;
		this.encomenda = encomenda;
		this.destinatario = destinatario;
	}
	public Date getDataPostagem() {
		return dataPostagem;
	}
	public void setDataPostagem(Date dataPostagem) {
		this.dataPostagem = dataPostagem;
	}
	public Date getPrevisaoEntregaDate() {
		return previsaoEntregaDate;
	}
	public void setPrevisaoEntregaDate(Date previsaoEntregaDate) {
		this.previsaoEntregaDate = previsaoEntregaDate;
	}
	public Encomenda getEncomenda() {
		return encomenda;
	}
	public void setEncomenda(Encomenda encomenda) {
		this.encomenda = encomenda;
	}
	public Destinatario getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}

	
}
