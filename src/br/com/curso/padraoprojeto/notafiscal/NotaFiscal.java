package br.com.curso.padraoprojeto.notafiscal;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	
	private String razãoSocial;
	private String cnpj;
	private Calendar dataEmissão;
	private double valorBruto;
	public List<ItemDaNota> itens;
	public String observações;
	public NotaFiscal(String razãoSocial, String cnpj, Calendar dataEmissão, double valorBruto, List<ItemDaNota> itens,
			String observações) {
		this.razãoSocial = razãoSocial;
		this.cnpj = cnpj;
		this.dataEmissão = dataEmissão;
		this.valorBruto = valorBruto;
		this.itens = itens;
		this.observações = observações;
	}
	public String getRazãoSocial() {
		return razãoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public Calendar getDataEmissão() {
		return dataEmissão;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public List<ItemDaNota> getItens() {
		return itens;
	}
	public String getObservações() {
		return observações;
	}
	
}
