package br.com.curso.padraoprojeto.pasta1;

import br.com.curso.padraoprojeto.pasta2.Item;

public class IKCV extends TemplateDeImpostoCondicional {
	
	public IKCV(){
		
	}
	
	public IKCV(Imposto outroImposto){
		super(outroImposto);
	}
	
	private boolean temItemMaiorQue100ReaisNo(Orçamento orçamento) {
		for(Item item : orçamento.getItens()) {
			if(item.getValor() > 100) return true;
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Orçamento orçamento) {
		return orçamento.getValor() * 0.10;
	}

	@Override
	public double minimaTaxacao(Orçamento orçamento) {
		return orçamento.getValor() *0.06;
	}
	
	@Override
	public boolean deveUsarMaximaTaxacao(Orçamento orçamento) {
		return orçamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orçamento);
	}
	
}
