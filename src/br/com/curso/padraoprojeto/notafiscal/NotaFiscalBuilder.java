package br.com.curso.padraoprojeto.notafiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	
	private String raz�oSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private String observa��es;
	private Calendar data;
	private List<Ap�sGerarNota> executaA��es;
	
	public NotaFiscalBuilder(){
		this.executaA��es = new ArrayList<Ap�sGerarNota>();
	}
	
	public void adicionaA��o(Ap�sGerarNota a��o) {
		this.executaA��es.add(a��o);
	}

	public NotaFiscalBuilder paraEmpresa(String raz�oSocial) {
		this.raz�oSocial = raz�oSocial;
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
	
	public NotaFiscalBuilder comObserva��es(String observa��es) {
		this.observa��es = observa��es;
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
	
	public NotaFiscal constr�i(){
		NotaFiscal nf = new NotaFiscal(raz�oSocial, cnpj, data, valorBruto, todosItens, observa��es);
		
		for(Ap�sGerarNota a��o : executaA��es){
			a��o.executa(nf);
		}
		
		return nf;
	}

}
