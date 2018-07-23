package br.com.curso.padraoprojeto.notafiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String razãoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private String observações;
	private Calendar data;
	private List<ApósGerarNota> executaAções;
	
	public NotaFiscalBuilder(){
		this.executaAções = new ArrayList<ApósGerarNota>();
	}
	
	public void adicionaAção(ApósGerarNota ação) {
		this.executaAções.add(ação);
	}

	public NotaFiscalBuilder paraEmpresa(String razãoSocial) {
		this.razãoSocial = razãoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder com(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor();
		return this;
	}
	
	public NotaFiscalBuilder comObservações(String observações) {
		this.observações = observações;
		return this;
	}

	public NotaFiscalBuilder naDataAtual() {
		this.data = Calendar.getInstance();
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar novaData) {
        this.data = novaData;
        return this;
    }
	
	public NotaFiscal constrói(){
		NotaFiscal nf = new NotaFiscal(razãoSocial, cnpj, data, valorBruto, todosItens, observações);
		
		for(ApósGerarNota ação : executaAções){
			ação.executa(nf);
		}
		
		return nf;
	}

}
