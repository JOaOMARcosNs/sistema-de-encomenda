package br.com.classes;

import java.sql.Date;

public class Encomenda {
	private Date dataPostagemDate;
	private Date previsaoEntregaDate;
	private Remetente remetente;
	private Destinatario destinatario;
	public Encomenda(Date dataPostagemDate, Date previsaoEntregaDate, Remetente remetente, Destinatario destinatario) {
		super();
		this.dataPostagemDate = dataPostagemDate;
		this.previsaoEntregaDate = previsaoEntregaDate;
		this.remetente = remetente;
		this.destinatario = destinatario;
	}
	public Date getDataPostagemDate() {
		return dataPostagemDate;
	}
	public void setDataPostagemDate(Date dataPostagemDate) {
		this.dataPostagemDate = dataPostagemDate;
	}
	public Date getPrevisaoEntregaDate() {
		return previsaoEntregaDate;
	}
	public void setPrevisaoEntregaDate(Date previsaoEntregaDate) {
		this.previsaoEntregaDate = previsaoEntregaDate;
	}
	public Remetente getRemetente() {
		return remetente;
	}
	public void setRemetente(Remetente remetente) {
		this.remetente = remetente;
	}
	public Destinatario getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}
		
}
