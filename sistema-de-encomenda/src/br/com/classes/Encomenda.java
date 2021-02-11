package br.com.classes;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Encomenda {
	private Date dataPostagem;
	private Date previsaoEntregaDate;
	private Remetente remetente;
	private Destinatario destinatario;
	


	public Encomenda(String dataPostagem, Date previsaoEntregaDate, Remetente remetente, Destinatario destinatario) {
		super();
		try {
			this.dataPostagem = new SimpleDateFormat("dd/MM/yyyy").parse(dataPostagem);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.previsaoEntregaDate = previsaoEntregaDate;
		this.remetente = remetente;
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
