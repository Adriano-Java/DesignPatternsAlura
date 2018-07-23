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
	public boolean deveUsarMaximaTaxacao(Or�amento or�amento) {
		List<String> noOr�amento = new ArrayList<String>();
		
		for(Item item : or�amento.getItens()) {
			if(noOr�amento.contains(item.getNome())) return true;
			else noOr�amento.add(item.getNome());
		}
		return false;
	}

	@Override
	public double maximaTaxacao(Or�amento or�amento) {
		return or�amento.getValor() * 0.13 + 100;
	}

	@Override
	public double minimaTaxacao(Or�amento or�amento) {
		return or�amento.getValor() * (0.01 * or�amento.getItens().size());
	}

}
