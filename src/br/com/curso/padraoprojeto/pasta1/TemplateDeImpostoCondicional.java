package br.com.curso.padraoprojeto.pasta1;

public abstract class TemplateDeImpostoCondicional extends Imposto{
	
	public TemplateDeImpostoCondicional(){}

	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	@Override
	public final double calcula(Or�amento or�amento) {
		if(deveUsarMaximaTaxacao(or�amento)) {
			return maximaTaxacao(or�amento) + calculoDoOutroImposto(or�amento);
		} else {
			return minimaTaxacao(or�amento) + calculoDoOutroImposto(or�amento);
		}
	}
	
	public abstract double maximaTaxacao(Or�amento or�amento);
	public abstract double minimaTaxacao(Or�amento or�amento);
	public abstract boolean deveUsarMaximaTaxacao(Or�amento or�amento);

}
