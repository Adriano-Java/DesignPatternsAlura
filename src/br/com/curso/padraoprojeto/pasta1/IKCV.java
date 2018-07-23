package br.com.curso.padraoprojeto.pasta1;

import br.com.curso.padraoprojeto.pasta2.Item;

public class IKCV extends TemplateDeImpostoCondicional {
	
	public IKCV(){
		
	}
	
	public IKCV(Imposto outroImposto){
		super(outroImposto);
	}
	
	private boolean temItemMaiorQue100ReaisNo(Or�amento or�amento) {
		for(Item item : or�amento.getItens()) {
			if(item.getValor() > 100) return true;
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Or�amento or�amento) {
		return or�amento.getValor() * 0.10;
	}

	@Override
	public double minimaTaxacao(Or�amento or�amento) {
		return or�amento.getValor() *0.06;
	}
	
	@Override
	public boolean deveUsarMaximaTaxacao(Or�amento or�amento) {
		return or�amento.getValor() > 500 && temItemMaiorQue100ReaisNo(or�amento);
	}
	
}
