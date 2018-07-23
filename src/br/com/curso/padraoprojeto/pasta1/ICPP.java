package br.com.curso.padraoprojeto.pasta1;

public class ICPP extends TemplateDeImpostoCondicional{
	
	public ICPP(){
		
	}
	
	public ICPP(Imposto outroImposto){
		super(outroImposto);
	}

	@Override
	public double maximaTaxacao(Orçamento orçamento) {
		return orçamento.getValor() * 0.05;
	}

	@Override
	public double minimaTaxacao(Orçamento orçamento) {
		return orçamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orçamento orçamento) {
		return orçamento.getValor() > 500;
	}

}
