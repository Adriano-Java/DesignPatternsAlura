package br.com.curso.padraoprojeto.pasta1;

public abstract class TemplateDeImpostoCondicional extends Imposto{
	
	public TemplateDeImpostoCondicional(){}

	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	@Override
	public final double calcula(Orçamento orçamento) {
		if(deveUsarMaximaTaxacao(orçamento)) {
			return maximaTaxacao(orçamento) + calculoDoOutroImposto(orçamento);
		} else {
			return minimaTaxacao(orçamento) + calculoDoOutroImposto(orçamento);
		}
	}
	
	public abstract double maximaTaxacao(Orçamento orçamento);
	public abstract double minimaTaxacao(Orçamento orçamento);
	public abstract boolean deveUsarMaximaTaxacao(Orçamento orçamento);

}
