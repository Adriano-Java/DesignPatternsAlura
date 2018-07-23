package br.com.curso.padraoprojeto.pasta1;

import java.util.ArrayList;
import java.util.List;

import br.com.curso.padraoprojeto.pasta2.Item;

public class IHIT extends TemplateDeImpostoCondicional{
	
	public IHIT(){
		
	}
	
	public IHIT(Imposto outroImposto){
		super(outroImposto);
	}
	
	@Override
	public boolean deveUsarMaximaTaxacao(Orçamento orçamento) {
		List<String> noOrçamento = new ArrayList<String>();
		
		for(Item item : orçamento.getItens()) {
			if(noOrçamento.contains(item.getNome())) return true;
			else noOrçamento.add(item.getNome());
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Orçamento orçamento) {
		return orçamento.getValor() * 0.13 + 100;
	}

	@Override
	public double minimaTaxacao(Orçamento orçamento) {
		return orçamento.getValor() * (0.01 * orçamento.getItens().size());
	}

}
