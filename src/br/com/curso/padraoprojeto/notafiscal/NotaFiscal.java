package br.com.curso.padraoprojeto.notafiscal;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	
	private String raz�oSocial;
	private String cnpj;
	private Calendar dataEmiss�o;
	private double valorBruto;
	public List<ItemDaNota> itens;
	public String observa��es;
	public NotaFiscal(String raz�oSocial, String cnpj, Calendar dataEmiss�o, double valorBruto, List<ItemDaNota> itens,
			String observa��es) {
		this.raz�oSocial = raz�oSocial;
		this.cnpj = cnpj;
		this.dataEmiss�o = dataEmiss�o;
		this.valorBruto = valorBruto;
		this.itens = itens;
		this.observa��es = observa��es;
	}
	public String getRaz�oSocial() {
		return raz�oSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public Calendar getDataEmiss�o() {
		return dataEmiss�o;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public List<ItemDaNota> getItens() {
		return itens;
	}
	public String getObserva��es() {
		return observa��es;
	}
	
}
