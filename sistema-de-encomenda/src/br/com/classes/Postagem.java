package br.com.classes;
import java.util.Date;

public class Postagem {
	private Date dataPostagem;
	private Date previsaoEntregaDate;
	private Encomenda encomenda;
	private Destinatario destinatario;
	private Funcionario funcionario;
	public Postagem(Date dataPostagem, Date previsaoEntregaDate, Encomenda encomenda, Destinatario destinatario, Funcionario funcionario) {
		super();
		this.dataPostagem = dataPostagem;
		this.previsaoEntregaDate = previsaoEntregaDate;
		this.encomenda = encomenda;
		this.destinatario = destinatario;
		this.funcionario = funcionario;
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
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}	
}
